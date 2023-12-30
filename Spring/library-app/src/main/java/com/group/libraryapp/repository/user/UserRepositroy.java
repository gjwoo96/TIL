package com.group.libraryapp.repository.user;

import com.group.libraryapp.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserRepositroy {

    //자바 데이터베이스 커넥터
    private final JdbcTemplate jdbcTemplate;

    //jdbc 템플릿을 스프링이 알아서 넣어줌
    public UserRepositroy(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    //매개변수로 request의 모든필드가 쓰이는게 아니다보니, 필요한 필드만 받아온다.(개인의 취향)
    public boolean isUserNotExist(long id){
        // VALUES부분에 ?(물음표)처리를 한 이유는 파라미터값이 유동적이기때문이다.
        String readSql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.query(readSql,(rs, rowNum) -> 0,id).isEmpty();
    }

    public boolean isUserNotExist(String name){
        String readSql = "SELECT * FROM user WHERE name = ?";
        return jdbcTemplate.query(readSql,(rs, rowNum) -> 0,name).isEmpty();
    }

    public void saveUser(String name,Integer age){
        String sql = "INSERT INTO user (name,age) VALUES (?,?)";
        jdbcTemplate.update(sql,name,age);
    }

    public List<UserResponse> getUser(){

        String sql = "SELECT * FROM user";

        //아래 override 된 함수는 쿼리의 결과값을 반환타입객체로 변환해주는 메소드이다.
        // Alt + enter로 기존코드를 람다형식으로 변환함.
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            //rs.get데이터타입("컬럼명")으로 해당 컬럼의 값을 가져온다.
            long id = rs.getLong("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            return new UserResponse(id, name, age);
        });
    }

    public void updateUserName(String name,long id){
        String sql = "UPDATE user SET name = ? WHERE id = ?";
        //jdbcTemplate.update()는 데이터에 변경이 이뤄질때 사용하기때문에
        // Insert,Update,Delete시 사용가능하다.
        jdbcTemplate.update(sql,name,id);
    }

    public void deleteUser(String name){
        String sql = "DELETE FROM user WHERE name = ?";
        jdbcTemplate.update(sql,name);
    }

}

package com.group.libraryapp.controller.user;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    //자바 데이터베이스 커넥터
    private final JdbcTemplate jdbcTemplate;

    //jdbc 템플릿을 스프링이 알아서 넣어줌
    public UserController(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/user") // POST / user
    public void saveUser(@RequestBody UserCreateRequest request) {
        // VALUES부분에 ?(물음표)처리를 한 이유는 파라미터값이 유동적이기때문이다.
        String sql = "INSERT INTO user (name, age) VALUES (?,?)";

        //jdbcTemplate.update()는 데이터에 변경이 이뤄질때 사용하기때문에
        // Insert,Update,Delete시 사용가능하다.
        jdbcTemplate.update(sql,request.getName(),request.getAge());
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
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

    @PutMapping("/user")
    public void updateUsers(@RequestBody UserUpdateReuqest request){
        String readSql = "SELECT * FROM user WHERE id = ?";
        boolean isUserNotExist = jdbcTemplate.query(readSql,(rs, rowNum) -> 0,request.getId()).isEmpty();
        if(isUserNotExist){
            throw new IllegalArgumentException();
        }
        String sql = "UPDATE user SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql,request.getName(),request.getId());
    }

    @DeleteMapping("user")
    public void deleteUser(@RequestParam String name){

        String readSql = "SELECT * FROM user WHERE name = ?";
        boolean isUserNotExist = jdbcTemplate.query(readSql,(rs, rowNum) -> 0,name).isEmpty();
        if(isUserNotExist){
            throw new IllegalArgumentException();
        }

        String sql = "DELETE FROM user WHERE name = ?";
        jdbcTemplate.update(sql,name);
    }

}

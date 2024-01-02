package com.springbootAllInOne.Repositroy.user;

import com.springbootAllInOne.DTO.UserInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean ExistCheckName(String name){
        String sql = "SELECT * FROM user WHERE name = ?";
        return jdbcTemplate.query(sql,(rs,rowNum) -> 0,name).isEmpty();
    }

    public void addUser(String name, int age){
        String sql = "INSERT INTO user (name, age) VALUES(?,?)";
        jdbcTemplate.update(sql,name,age);
    }

    public List<UserInfoRequest> selectAllUsers(){
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql,(rs,rowNum)->{
            long id = rs.getLong("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            return new UserInfoRequest(id,name,age);
        });
    }

}

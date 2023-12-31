package com.springbootAllInOne.Controller;

import com.springbootAllInOne.DTO.UserInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCtrl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PutMapping("/user/addUser")
    public void InsertUser(@RequestBody UserInfoRequest request){
        String readSql = "SELECT * FROM user WHERE name = ?";
        boolean Ex_Check = jdbcTemplate.query(readSql,(rs,rowNum) -> 0,request.getName()).isEmpty();
        if(Ex_Check){
            throw new IllegalArgumentException();
        }
        String insertSql = "INSERT INTO user (name,age) VALUES (?,?)";
        jdbcTemplate.update(insertSql,request.getName(),request.getAge());
    }

    @PostMapping ("/user/selectUser")
    public List<UserInfoRequest> SelectUser(){
        String selectSql = "SELECT * FROM user";
        return jdbcTemplate.query(selectSql,(rs,rowNum) ->{
            long id = rs.getLong("id");
            String name = rs.getString("name");
            int age = rs.getInt("age"); 
            return new UserInfoRequest(id,name,age);
        });
    }
}

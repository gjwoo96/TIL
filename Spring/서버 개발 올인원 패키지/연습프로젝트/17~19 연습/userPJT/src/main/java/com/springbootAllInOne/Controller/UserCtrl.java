package com.springbootAllInOne.Controller;

import com.springbootAllInOne.DTO.UserInfoRequest;
import com.springbootAllInOne.Service.user.UserService;
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
    private UserService UserService;

    @PutMapping("/user/addUser")
    public void InsertUser(@RequestBody UserInfoRequest request) throws Exception {
        UserService.addUser(request);
    }

    @PostMapping ("/user/selectUser")
    public List<UserInfoRequest> SelectUser(){
        return UserService.SelectAllUsers();
    }
}

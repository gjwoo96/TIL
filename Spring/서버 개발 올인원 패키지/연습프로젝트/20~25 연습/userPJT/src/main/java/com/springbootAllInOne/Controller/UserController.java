package com.springbootAllInOne.Controller;

import com.springbootAllInOne.DTO.UserInfoRequest;
import com.springbootAllInOne.Service.user.UserJPAService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserJPAService userJPAService;

    public UserController(UserJPAService userJPAService) {
        this.userJPAService = userJPAService;
    }
    @PostMapping("/user/jpa")
    public List<UserInfoRequest> JPAAllUser(){
        return userJPAService.getAllUsers();
    }
}

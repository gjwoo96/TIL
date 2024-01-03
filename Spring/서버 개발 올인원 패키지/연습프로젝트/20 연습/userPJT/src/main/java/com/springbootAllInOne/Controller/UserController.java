package com.springbootAllInOne.Controller;

import com.springbootAllInOne.Service.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public String AllUser(){
        return userService.GetAllUser();
   }
}

package com.springbootAllInOne.Controller;

import com.springbootAllInOne.Service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    /*setter로 빈주입 받는방법*/
    //private UserService userService;
    /*@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public String AllUser(){
        return userService.GetAllUser();
   }
}

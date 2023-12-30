package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    //jdbc 템플릿을 스프링이 알아서 넣어줌
    public UserController(JdbcTemplate jdbcTemplate){
        this.userService = new UserService(jdbcTemplate);
    }

    @PostMapping("/user") // POST / user
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userService.getUser();
    }

    @PutMapping("/user")
    public void updateUsers(@RequestBody UserUpdateReuqest request){
        //Controller부분에는 HTTP Body에서 값을 받는역할
        userService.updateUser(request);
    }

    @DeleteMapping("user")
    public void deleteUser(@RequestParam String name){
        userService.deleteUser(name);
    }

}

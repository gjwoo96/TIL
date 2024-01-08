package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserServiceV2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserServiceV2 userService;


    public UserController(UserServiceV2 userService){
        this.userService = userService;
    }

    @PostMapping("/user") // POST / user
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userService.getUsers();
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

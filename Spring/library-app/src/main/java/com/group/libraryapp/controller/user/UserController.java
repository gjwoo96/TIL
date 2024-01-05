package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserServiceV1;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserServiceV1 userServiceV1;


    public UserController(UserServiceV1 userServiceV1){
        this.userServiceV1 = userServiceV1;
    }

    @PostMapping("/user") // POST / user
    public void saveUser(@RequestBody UserCreateRequest request) {
        userServiceV1.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userServiceV1.getUser();
    }

    @PutMapping("/user")
    public void updateUsers(@RequestBody UserUpdateReuqest request){
        //Controller부분에는 HTTP Body에서 값을 받는역할
        userServiceV1.updateUser(request);
    }

    @DeleteMapping("user")
    public void deleteUser(@RequestParam String name){
        userServiceV1.deleteUser(name);
    }

}

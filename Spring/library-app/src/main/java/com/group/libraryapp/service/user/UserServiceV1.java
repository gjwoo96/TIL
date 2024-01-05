package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.repository.user.UserJdbcRepositroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceV1 {
    private final UserJdbcRepositroy userJdbcRepositroy;

    public UserServiceV1(UserJdbcRepositroy userJdbcRepositroy){
        this.userJdbcRepositroy = userJdbcRepositroy;
    }
    public void saveUser(UserCreateRequest userCreateRequest){
        userJdbcRepositroy.saveUser(userCreateRequest.getName(),userCreateRequest.getAge());
    }

    public List<UserResponse> getUser(){
        return userJdbcRepositroy.getUser();
    }

    public void updateUser(UserUpdateReuqest request){

        if(userJdbcRepositroy.isUserNotExist(request.getId())){
            throw new IllegalArgumentException();
        }
        userJdbcRepositroy.updateUserName(request.getName(), request.getId());
    }

    public void deleteUser(String name){
        if(userJdbcRepositroy.isUserNotExist(name)){
            throw new IllegalArgumentException();
        }
        userJdbcRepositroy.deleteUser(name);
    }
}

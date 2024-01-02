package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.repository.user.UserRepositroy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepositroy userRepositroy;

    public UserService(UserRepositroy userRepositroy){
        this.userRepositroy = userRepositroy;
    }
    public void saveUser(UserCreateRequest userCreateRequest){
        userRepositroy.saveUser(userCreateRequest.getName(),userCreateRequest.getAge());
    }

    public List<UserResponse> getUser(){
        return userRepositroy.getUser();
    }

    public void updateUser(UserUpdateReuqest request){

        if(userRepositroy.isUserNotExist(request.getId())){
            throw new IllegalArgumentException();
        }
        userRepositroy.updateUserName(request.getName(), request.getId());
    }

    public void deleteUser(String name){
        if(userRepositroy.isUserNotExist(name)){
            throw new IllegalArgumentException();
        }
        userRepositroy.deleteUser(name);
    }
}

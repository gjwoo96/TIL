package com.springbootAllInOne.Service.user;

import com.springbootAllInOne.DTO.UserInfoRequest;
import com.springbootAllInOne.Repositroy.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository UserRepositroy;

    public void addUser(UserInfoRequest Param) throws Exception {
        if(!UserRepositroy.ExistCheckName(Param.getName())){
            throw new Exception("이미 등록된 회원입니다.");
        }
        UserRepositroy.addUser(Param.getName(), Param.getAge());
    }

    public List<UserInfoRequest> SelectAllUsers(){
        return UserRepositroy.selectAllUsers();
    }
}

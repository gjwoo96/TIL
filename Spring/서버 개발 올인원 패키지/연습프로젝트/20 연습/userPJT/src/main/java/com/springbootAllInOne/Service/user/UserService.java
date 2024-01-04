package com.springbootAllInOne.Service.user;

import com.springbootAllInOne.Repositroy.user.AllRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final AllRepositroy allRepositroy;

    public UserService(@Qualifier("AR")AllRepositroy allRepositroy) {
        this.allRepositroy = allRepositroy;
    }
    public String GetAllUser(){

        return allRepositroy.GetAllUser();
    }

}

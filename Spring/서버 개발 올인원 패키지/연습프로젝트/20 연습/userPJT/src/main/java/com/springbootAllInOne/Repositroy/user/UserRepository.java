package com.springbootAllInOne.Repositroy.user;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("UserRepository")
public class UserRepository implements AllRepositroy{
    @Override
    public String GetAllUser() {
        return "UserRepository";
    }
}

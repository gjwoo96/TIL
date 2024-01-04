package com.springbootAllInOne.Repositroy.user;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("AR")
public class AdminRepositroy implements AllRepositroy{
    @Override
    public String GetAllUser() {
        return "AdminRepositroy";
    }
}

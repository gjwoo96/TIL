package com.springbootAllInOne.Service.user;

import com.springbootAllInOne.DTO.UserInfoRequest;
import com.springbootAllInOne.Repositroy.user.UserJPARepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserJPAService {

    private final UserJPARepository userJPARepository;

    public UserJPAService(UserJPARepository userJPARepository) {
        this.userJPARepository = userJPARepository;
    }

    public List<UserInfoRequest> getAllUsers(){
        return userJPARepository.findAll().stream()
                .map(UserInfoRequest::new)
                .collect(Collectors.toList());
    }
}

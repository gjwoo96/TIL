package com.group.libraryapp.service.user;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.domain.user.UserRepository;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateReuqest;
import com.group.libraryapp.dto.user.response.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceV2 {

    private final UserRepository userRepository;

    public UserServiceV2(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Transactional
    public void saveUser(UserCreateRequest request){
       User u =  userRepository.save(new User(request.getName(),request.getAge()));
       throw new IllegalArgumentException();
    }
    @Transactional(readOnly = true)
    public List<UserResponse>getUsers(){
        return userRepository.findAll().stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }
    @Transactional
    public void updateUser(UserUpdateReuqest request){
        // findById는 select * from user where id = ? 라는 쿼리를 실행하는것과 같고
        // 결과로는 Optional<User>형태로 나온다.(OptionalJDK8에 등장했다)
        // 정리하자면, 아래코드는 조회 쿼리를 실행해서 결과가 나오면 User객체에 반환, 없으면 예외처리를 발생한다.
        User user = userRepository.findById(request.getId())
                .orElseThrow(IllegalArgumentException::new);
        
        //Update 쿼리 부분
        user.updateName(request.getName());
        //userRepository.save(user);
    }
    @Transactional
    public void deleteUser(String name){
        // 이름을 조건으로 조회방법
        // SELECT * FROM user WHERE name = ?
        User user= userRepository.findByName(name)
                .orElseThrow(IllegalArgumentException::new);
       
        userRepository.delete(user);
    }

}

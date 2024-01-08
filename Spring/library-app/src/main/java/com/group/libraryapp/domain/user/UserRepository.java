package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    // 이름을 기준으로 조회하여 없다면 Null, 존재한다면 User객체 반환
    Optional<User> findByName(String name);


}

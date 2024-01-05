package com.springbootAllInOne.Repositroy.user;

import com.springbootAllInOne.DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<User,Long> {
}

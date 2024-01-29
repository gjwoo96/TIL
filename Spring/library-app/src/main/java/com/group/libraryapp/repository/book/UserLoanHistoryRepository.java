package com.group.libraryapp.repository.book;

import com.group.libraryapp.domain.book.Book;
import com.group.libraryapp.domain.book.UserLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserLoanHistoryRepository extends JpaRepository<UserLoanHistory,Long> {

    boolean existsByBookNameAndIsReturn(String name,boolean isReturn);
}

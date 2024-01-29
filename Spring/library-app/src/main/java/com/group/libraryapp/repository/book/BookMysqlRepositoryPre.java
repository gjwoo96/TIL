package com.group.libraryapp.repository.book;

import org.springframework.stereotype.Repository;

@Repository
public class BookMysqlRepositoryPre implements BookRepositroy_pre {
    @Override
    public void saveBook() {
        System.out.println("BookMysqlRepositoryPre");
    }
}

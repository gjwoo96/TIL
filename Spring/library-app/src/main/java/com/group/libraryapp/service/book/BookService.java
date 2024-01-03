package com.group.libraryapp.service.book;

import com.group.libraryapp.repository.book.BookMysqlRepository;
import com.group.libraryapp.repository.book.BookRepositroy;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepositroy bookRepositroy;

    public BookService(BookRepositroy bookRepositroy) {
        this.bookRepositroy = bookRepositroy;
    }

    public void saveBook(){
        bookRepositroy.saveBook();
    }

}

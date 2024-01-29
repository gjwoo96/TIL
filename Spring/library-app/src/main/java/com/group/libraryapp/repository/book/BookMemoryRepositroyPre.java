package com.group.libraryapp.repository.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Primary //주입받을 객체의 우선순위를 결정하는 어노테이션이다.
@Repository
public class BookMemoryRepositroyPre implements BookRepositroy_pre {
    @Override
    public void saveBook() {
        System.out.println("BookMemoryRepositroyPre");
    }

}

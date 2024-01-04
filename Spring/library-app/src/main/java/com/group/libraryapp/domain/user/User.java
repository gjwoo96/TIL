package com.group.libraryapp.domain.user;

import javax.persistence.*;

@Entity // 스프링이 User 객체와 user 테이블을 같은것을 바라본다.
public class User {
    @Id //id 필드라는것 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement 명시
    private Long id = null;
    @Column(nullable = false,length = 20) // name varchar(20)
    private String name;
    private Integer age;

    //JPA를 사용하기위해선 기본생성자 필수!
    protected User(){}

    public User(String name, Integer age) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.",name));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

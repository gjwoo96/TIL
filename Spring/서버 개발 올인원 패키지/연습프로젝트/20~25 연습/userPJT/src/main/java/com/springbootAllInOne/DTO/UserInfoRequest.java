package com.springbootAllInOne.DTO;

public class UserInfoRequest {
    private  long id;
    private  String name;
    private  int age;

    public UserInfoRequest(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public UserInfoRequest(long id, User user) {
        this.id = id;
        this.name = user.getName();
        this.age = user.getAge();
    }
    public UserInfoRequest(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.age = user.getAge();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserInfoRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

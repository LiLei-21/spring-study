package com.li.pojo;

public class UserT {
    private String User;

    public UserT(){
        System.out.println("UserT被创建");
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public void show(){
        System.out.println("name:"+User);
    }
}

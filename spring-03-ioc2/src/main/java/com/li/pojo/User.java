package com.li.pojo;

public class User {
    private String User;

//    public User(){
//        System.out.println("User无参的构造方法");
//    }

    public User(String User){
        this.User = User;
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

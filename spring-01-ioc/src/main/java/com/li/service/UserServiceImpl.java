package com.li.service;

import com.li.dao.UserDao;
import com.li.dao.UserDaoImpl;
import com.li.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //利用set进行动态值得注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

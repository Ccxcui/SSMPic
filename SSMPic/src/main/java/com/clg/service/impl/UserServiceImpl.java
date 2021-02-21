package com.clg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clg.dao.UserDao;
import com.clg.entity.User;

@Service
public class UserServiceImpl implements com.clg.service.UserService {
    @Autowired
    private UserDao userDao;
    public User CheckUser(String username, String password) {
        return userDao.getUserByName(username,password);
    }
}

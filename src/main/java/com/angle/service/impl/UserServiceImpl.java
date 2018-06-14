package com.angle.service.impl;

import com.angle.bean.User;
import com.angle.dao.UserDao;
import com.angle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    public List<User> getAll() {
        return userDao.getAll();
    }

    public User getLogin(String name, String age) {
        return userDao.getLogin(name,age);
    }
}

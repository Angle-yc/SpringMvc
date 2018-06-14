package com.angle.service;

import com.angle.bean.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getLogin(String name, String password);
}

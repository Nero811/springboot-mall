package com.jackyang.springbootmall.service.impl;

import com.jackyang.springbootmall.dao.UserDao;
import com.jackyang.springbootmall.dto.UserRegisterRequest;
import com.jackyang.springbootmall.model.User;
import com.jackyang.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

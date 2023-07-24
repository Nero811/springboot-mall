package com.jackyang.springbootmall.service;

import com.jackyang.springbootmall.dto.UserLoginRequest;
import com.jackyang.springbootmall.dto.UserRegisterRequest;
import com.jackyang.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}

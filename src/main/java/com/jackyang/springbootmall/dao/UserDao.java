package com.jackyang.springbootmall.dao;

import com.jackyang.springbootmall.dto.UserRegisterRequest;
import com.jackyang.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}

package com.us.user.service;

import com.us.user.entity.User;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/9/3 8:04 PM
 */
public interface IUserService {

    Integer addUser(User user);

    List<User> queryUsers();

    String handleUserByGender(User user);

}

package com.us.user.service.impl;

import com.us.user.entity.User;
import com.us.user.mapper.IUserMapper;
import com.us.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/9/3 8:05 PM
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public List<User> queryUsers() {
        return userMapper.listUsers();
    }

}

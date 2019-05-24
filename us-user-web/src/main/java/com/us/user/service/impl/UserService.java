package com.us.user.service.impl;

import com.us.user.entity.User;
import com.us.user.mapper.IUserMapper;
import com.us.user.service.IUserService;
import com.us.user.strategy.sex.SexHandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * @author liangliang
 * @date 2018/9/3 8:05 PM
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    @Autowired
    private SexHandlerContext sexHandlerContext;

    @Override
    @Transactional
    public Integer addUser(User user) {
        Objects.requireNonNull(user);
        userMapper.addUser(user);

        // 测试回滚
        int error = 1 / 0;

        return user.getId();
    }

    @Override
    public List<User> queryUsers() {
        return userMapper.listUsers();
    }

    @Override
    public String handleUserByGender(User user) {
        sexHandlerContext.getHandler(user.getSex().toString()).handle();
        return "ok";
    }

}

package com.us.user.service;

import com.us.claudine.test.AbstractCommonTest;
import com.us.user.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liangliang
 * @date 2019/4/19 4:37 PM
 */
public class UserServiceTest extends AbstractCommonTest {

    @Autowired
    private IUserService userService;

    @Test
    public void addUser() {
        User user = new User(null, "Jim3", 0, 0);
        userService.addUser(user);
        System.out.println(user);
    }


    @Test
    public void queryUsers() throws Exception {
        List<User> users = userService.queryUsers();
        System.out.println(users);
    }

}
package com.us.user.web;

import com.us.user.common.Result;
import com.us.user.entity.User;
import com.us.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/9/3 7:35 PM
 */
@RestController
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController implements IUserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    @Override
    public Result<List<User>> queryUsers() {
        List<User> users = userService.queryUsers();
        return Result.success("OK", users);
    }

}

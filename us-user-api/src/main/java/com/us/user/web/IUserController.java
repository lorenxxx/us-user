package com.us.user.web;

import com.us.user.common.Result;
import com.us.user.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/9/3 7:41 PM
 */
@Api(value = "User-API", description = "用户-API")
public interface IUserController {

    @ApiOperation(value = "查询用户列表", notes = "查询用户列表")
    Result<List<User>> queryUsers();

}

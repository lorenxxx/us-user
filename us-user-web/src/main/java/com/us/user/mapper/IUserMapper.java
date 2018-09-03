package com.us.user.mapper;

import com.us.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/9/3 7:17 PM
 */
@Mapper
public interface IUserMapper {

    List<User> listUsers();

}

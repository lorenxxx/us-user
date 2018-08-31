package com.us.user.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liangliang
 * @date 2018/8/31 8:09 PM
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {

    private boolean succeed;

    private String msg;

    private T data;

    public static <T> Result success(String msg, T data) {
        return new Result(true, msg, data);
    }

    public static Result fail(String msg) {
        return new Result(false, msg, null);
    }

}
package com.us.user.demo.config;

import com.us.user.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangliang
 * @date 2018/8/28 10:55 AM
 */
@RestController
@RequestMapping("/api/v1/config")
@Slf4j
public class ConfigController {

    @Value("${blog.address}")
    private String address;

    @Value("${blog.author}")
    private String author;

    @Autowired
    private BlogConfig blogConfig;

    @Autowired
    private AdminConfig adminConfig;

    @GetMapping("/demo")
    public Result demo() {
        return Result.success("OK",address + " | " + author);
    }

    @GetMapping("/blogConfig")
    public Result<BlogConfig> queryBlogConfig() {
        return Result.success("OK", blogConfig);
    }

    @GetMapping("/adminConfig")
    public Result<AdminConfig> queryAdminConfig() {
        return Result.success("OK", adminConfig);
    }

}

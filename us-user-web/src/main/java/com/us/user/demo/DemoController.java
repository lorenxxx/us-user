package com.us.user.demo;

import com.us.user.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "First Demo", description = "First Demo")
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @ApiOperation(value = "Say Hello", notes = "Say Hello")
    @GetMapping("/hello")
    public Result<String> hello() {
        return Result.success("OK", "Hello, SpringBoot!");
    }

}

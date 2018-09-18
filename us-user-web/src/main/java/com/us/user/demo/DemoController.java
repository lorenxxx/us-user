package com.us.user.demo;

import com.us.claudine.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "First Demo", description = "First Demo")
@RestController
@RequestMapping("/demo")
public class DemoController {

    @ApiOperation(value = "Say Hello", notes = "Say Hello")
    @GetMapping
    public Result<String> demo() {
        return Result.success("OK", "Hello, SpringBoot!");
    }

}

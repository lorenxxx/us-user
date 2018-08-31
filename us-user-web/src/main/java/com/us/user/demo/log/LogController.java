package com.us.user.demo.log;

import com.us.user.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangliang
 * @date 2018/8/28 8:23 PM
 */
@RestController
@RequestMapping("/api/v1/log")
@Slf4j
public class LogController {

    @GetMapping("/demo")
    public Result<String> demo() {
        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");

        return Result.success("OK", "Hello, Logback!");
    }

}

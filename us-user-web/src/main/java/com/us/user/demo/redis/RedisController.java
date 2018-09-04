package com.us.user.demo.redis;

import com.us.user.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author liangliang
 * @date 2018/9/4 2:41 PM
 */
@RestController
@RequestMapping("/redis")
@Slf4j
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @PostMapping("/set/{key}/{value}")
    public Result<String> setValue(@PathVariable("key") String key, @PathVariable("value") String value) {
        log.info("key: " + key);
        log.info("value: " + value);

        redisTemplate.opsForValue().set(key, value);
        return Result.success("OK", "OK");
    }

    @GetMapping("/get/{key}")
    public Result<String> getValue(@PathVariable("key") String key) {
        log.info("key: " + key);

        String value = redisTemplate.opsForValue().get(key);
        return Result.success("OK", value);
    }

}

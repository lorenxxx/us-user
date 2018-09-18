package com.us.user.demo.rabbitmq;

import com.us.claudine.common.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangliang
 * @date 2018/9/5 8:40 PM
 */
@RestController
@RequestMapping("/rabbitmq")
@Slf4j
public class RabbitMQController {

    @Autowired
    IRabbitMQService rabbitMQService;

    @PostMapping("/send")
    public Result<String> send(@RequestParam("msg") String msg) {
        log.info("msg: " + msg);

        rabbitMQService.sendMsg(msg);
        return Result.success("OK", msg);
    }

}

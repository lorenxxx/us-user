package com.us.user.demo.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Loren on 2018/10/8.
 */
@Configuration
@ConditionalOnClass({BananaFighter.class})
public class Van2Config {

    @Bean
    public IFighter bananaFighter() {
        return new BananaFighter();
    }

    @Bean
    public VanPlayer vanPlayer() {
        return new VanPlayer(bananaFighter());
    }

}

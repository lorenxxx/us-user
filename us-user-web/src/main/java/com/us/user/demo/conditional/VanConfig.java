package com.us.user.demo.conditional;

import org.springframework.context.annotation.Bean;

/**
 * Created by Loren on 2018/10/8.
 */
//@Configuration
//@ConditionalOnClass({BillyFighter.class})
public class VanConfig {

    @Bean
    public IFighter billyFighter() {
        return new BillyFighter();
    }

    @Bean
    public VanPlayer vanPlayer() {
        return new VanPlayer(billyFighter());
    }

}

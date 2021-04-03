package com.shiguang.config;

import com.shiguang.log.Log;
import com.shiguang.service.UserService;
import com.shiguang.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {


    @Bean
    public UserService userService(){

        return new UserServiceImpl();
    }


    @Bean
    public Log log(){

        return new Log();
    }

}

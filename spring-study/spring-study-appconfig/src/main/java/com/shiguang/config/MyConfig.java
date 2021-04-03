package com.shiguang.config;

import com.shiguang.pojo.User;
import com.shiguang.service.UserService;
import com.shiguang.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {


    @Bean
    public User user(){

        return new User();
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}

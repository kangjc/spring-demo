package com.shiguang.controller;


import com.shiguang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getBean")
    public String getName(){

        return userService.getName();
    }
}

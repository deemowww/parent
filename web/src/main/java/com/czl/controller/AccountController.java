package com.czl.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @ApiOperation(value = "新建用户")
    @RequestMapping(value = "/register")
    public void register(@RequestParam("username") String username,
                         @RequestParam("email") String email,
                         @RequestParam("password") String password,
                         @RequestParam("affiliation") String affiliation,
                         @RequestParam("role") String role){

        System.out.println(username);
        System.out.println(email);
        System.out.println(password);
        System.out.println(affiliation);
        System.out.println(role);
    }
    @ApiOperation(value = "新建种植记录，简单的一个测试，用的form表单传输数据")
    @RequestMapping(value = "/login")
    public void login(@RequestParam("username") String username,
                         @RequestParam("password") String password){

        System.out.println(username);
        System.out.println(password);
    }
}

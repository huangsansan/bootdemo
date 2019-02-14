package com.hhb.controller;

import com.hhb.dao.DemoUser;
import com.hhb.services.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
public class HelloWorldController {

    @Autowired
    private DemoUserService du;
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        long count = du.getCount();
        System.out.println(count);
        return "hello world ! springboot";
    }
}

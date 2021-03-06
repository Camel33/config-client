package com.config.client.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mengxg on 2018/12/1
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${from}")
     private String from;

    @Autowired
    private Environment environment;

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }

    @RequestMapping("/from1")
    public String from1(){
        return environment.getProperty("from","undefiend");
    }
}

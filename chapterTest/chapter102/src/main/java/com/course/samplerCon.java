package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class samplerCon {

    @RequestMapping
    @ResponseBody
    String home(){
        return "Hellp spring boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(samplerCon.class,args);
    }
}

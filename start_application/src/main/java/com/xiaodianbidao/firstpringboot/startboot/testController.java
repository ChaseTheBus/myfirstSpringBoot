package com.xiaodianbidao.firstpringboot.startboot;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/")
    public String test_helloWord(){
        System.out.println("hello world");
        return "hello world";
    }
}

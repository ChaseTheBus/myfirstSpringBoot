package com.xiaodianbidao.firstpringboot.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestwebController {

    @RequestMapping("/testController")
    public String testWebController(){
        System.out.println("this is test_web testWebController");
        return "testController";
    }

}

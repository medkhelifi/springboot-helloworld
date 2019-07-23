package com.medkhelifi.tutorials.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "" )
    public String index (){
        return "hello world from Spring boot";
    }
}

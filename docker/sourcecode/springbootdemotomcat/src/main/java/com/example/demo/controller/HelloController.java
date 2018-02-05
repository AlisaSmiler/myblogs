package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "hello/{content}")
    public String getAgentInfoList(@PathVariable String content) {
        System.out.println("==========hejing afu==========");
        System.out.println("==========hejing afu==========");
        return content + ", alisa";
    }
}

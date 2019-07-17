package com.xhb.jenkins.bo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hi")
public class HelloController {

    @GetMapping
    public String hello(){
        return "nihao";
    }
}

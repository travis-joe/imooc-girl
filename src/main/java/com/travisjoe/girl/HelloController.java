package com.travisjoe.girl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot\n"+cupSize+age;
    }
}

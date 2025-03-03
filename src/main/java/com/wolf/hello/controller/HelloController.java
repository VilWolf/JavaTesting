package com.wolf.hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/segundaPrueba")
    public String segundaPrueba() {
        return "Esta es segunda prueba";
    }

}

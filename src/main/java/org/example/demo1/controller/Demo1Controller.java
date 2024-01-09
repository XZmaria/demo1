package org.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    //http://localhost:8080/hello?name=zrz
    @GetMapping("/hello")
    public String Hello(String name) {
        return "hello demo1~~~~" + name;
    }
}

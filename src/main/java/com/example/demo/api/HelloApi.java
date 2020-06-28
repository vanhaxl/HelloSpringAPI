package com.example.demo.api;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @Autowired
    private HelloService helloService;

    @GetMapping("/ping")
    public String saveDate() {
        helloService.saveFile();
        return "Saved current date time.";
    }
}

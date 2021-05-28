package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anjude
 * @date 2021/5/28 22:40
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello, you success!";
    }
}

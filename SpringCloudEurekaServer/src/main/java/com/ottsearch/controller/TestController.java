package com.ottsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(path = "/")
    public String test() {
        return "hello\n";
    }
}

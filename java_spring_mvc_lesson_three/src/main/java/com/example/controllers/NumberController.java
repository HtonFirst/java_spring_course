package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/number")
public class NumberController {

    @GetMapping("/first")
    public String firstMethod() {
        return "number-pages/first";
    }

    @GetMapping("/second")
    public String secondMethod() {
        return "number-pages/second";
    }

    @GetMapping("/third")
    public String thirdMethod() {
        return "number-pages/third";
    }

}

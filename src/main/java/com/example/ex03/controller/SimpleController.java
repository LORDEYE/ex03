package com.example.ex03.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/simple")
public class SimpleController {
    @GetMapping("/ex1")
    public void ex1(){
        log.info("ex1..........");
    }
}

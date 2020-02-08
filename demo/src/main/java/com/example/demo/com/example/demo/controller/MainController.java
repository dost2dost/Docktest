package com.example.demo.com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DostM on 12/22/2019.
 */
@RestController
public class MainController {
    @GetMapping(value = "/test")
    public String disp(){
        return "hello from controller for web hook test also jj  ";

    }

    @GetMapping(value = "/hello")
    public String disp1(){
        return "Come to join me here ! ";


    }
}

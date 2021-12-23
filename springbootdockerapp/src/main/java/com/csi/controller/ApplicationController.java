package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {





    @GetMapping
    public String sayHello()
    {
        return "WELCOME TO FINTECH CSI PUNE";
    }

    @GetMapping("/address")
    public String csiAddress()
    {
        return "INSPIRIA MALL | PUNE | MH | INDIA";
    }

    @GetMapping("/ser")
    public String ser()
    {
        return "software";
    }

}

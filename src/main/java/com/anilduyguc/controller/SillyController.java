package com.anilduyguc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SillyController {
    @RequestMapping("/show-form")
    public String displayTheForm(){
        return "helloworld";
    }
}

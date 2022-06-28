package com.anilduyguc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping( "/")
    public String getPage(){
        return "main-menu";
    }
}

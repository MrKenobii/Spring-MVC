package com.anilduyguc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;



@Controller
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm(){
        return "helloworld-form"; //should be matched with the existing .jsp file
    }

    @RequestMapping("process-form")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("process-form-v2")
    public String letsShout(HttpServletRequest request, Model model ){
        String name = request.getParameter("student-name").toUpperCase();
        model.addAttribute("message", "Yo!! " + name);
        return "helloworld";

    }
}

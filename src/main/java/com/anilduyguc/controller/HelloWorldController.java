package com.anilduyguc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;



@Controller
@RequestMapping("/hello")
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
        String name = request.getParameter("studentName").toUpperCase();
        System.out.println(request);
        model.addAttribute("message", "Yo!! " + name);
        return "helloworld";
    }

    @RequestMapping("process-form-v3")
    public String processFormV3(@RequestParam("studentName") String name, Model model ){
        model.addAttribute("message", "Hey Fellow!! " + name.toUpperCase());
        return "helloworld";
    }
}

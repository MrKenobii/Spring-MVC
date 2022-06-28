package com.anilduyguc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

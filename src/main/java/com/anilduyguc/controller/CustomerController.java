package com.anilduyguc.controller;

import com.anilduyguc.entity.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    @InitBinder // Pre-Process every String from data
    public void initBinder(WebDataBinder webDataBinder){ // Removes leading and trailing white space
        // If String has only white space, trim it to null!
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @RequestMapping("/show-form")
    public String getCustomerForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer,
                              BindingResult bindingResult){ // @Valid performs a validation rule
        // results of validation placed in BindingResult class
        System.out.println("\n\n\n Binding result: " + bindingResult + "\n\n\n");
        if (bindingResult.hasErrors()) return "customer-form";
        return  "customer-confirmation";
    }
}
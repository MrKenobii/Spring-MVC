package com.anilduyguc.controller;

import com.anilduyguc.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    @RequestMapping("/show-form")
    public String getCustomerForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/process-form")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer,
                              BindingResult bindingResult){ // @Valid performs a validation rule
                                                            // results of validation placed in BindingResult class
        if (bindingResult.hasErrors()) return "customer-form";
        return  "customer-confirmation";
    }
}

package com.bantc.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome at web store!");
        model.addAttribute("tagline", "The best online shop");

        return "welcome";
    }
    
}

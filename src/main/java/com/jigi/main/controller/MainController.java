package com.jigi.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model){
        model.addAttribute("data", "Hell");
        return "main/main";
    }
}

package com.jigi.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String goMain(){
//  public String main(Model model){
//      model.addAttribute("data", "Hell"); 아직은 사용하지 않아요
        return "main/main";
    }

    @RequestMapping("/api/goBoard")
    public String goBoard(){
        System.out.println("요청은 들어오니..? 나중엔 log를 찍을거에요");
        return "main/board";
    }
}

package com.jigi.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /**
     * 경로 이동만을 위한 MainController
     **/
    @GetMapping("/")
    public String goMain(){
//  public String main(Model model){
//      model.addAttribute("data", "Hell"); 아직은 사용하지 않아요
        return "main/main";
    }

    @GetMapping("/api/goBoard")
    public String goBoard(){
        System.out.println("/api/goBoard 요청은 들어오니..? 나중엔 log를 찍을거에요");
        return "main/board";
    }

    @GetMapping("/api/goUserInsert")
    public String goInsertUser(){
        System.out.println("/api/goUserInsert 요청은 들어오니..? 나중엔 log를 찍을거에요");
        return "user/userInsert";
    }

    @GetMapping("/api/goUserLogin")
    public String goUserLogin(){
        System.out.println("/api/goUserLogin 요청은 들어오니..? 나중엔 log를 찍을거에요");
        return "user/userLogin";
    }

    @GetMapping("/api/goBoardGuest")
    public String goBoardGuest(){
        System.out.println("/api/goBoardGuest 요청은 들어오니..? 나중엔 log를 찍을거에요");
        return "main/boardGuest";
    }

    @GetMapping("/api/goBoardNotice")
    public String goBoardNotice(){
        System.out.println("/api/goBoardNotice 요청은 들어오니..? 나중엔 log를 찍을거에요");
        return "main/boardNotice";
    }
}

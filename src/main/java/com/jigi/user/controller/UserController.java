package com.jigi.user.controller;

import com.jigi.user.dto.UserDto;
import com.jigi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/api/userInsert")
    public String insertUser(UserDto usertDto) throws Exception {
        System.out.println("/api/goUserInsert 요청은 들어오니..? 나중엔 log를 찍을거에요");
        userService.insertUser(usertDto);
        return "user/userInsertAfter";
    }
}

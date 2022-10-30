package com.jigi.user.controller;

import com.jigi.user.dto.UserDto;
import com.jigi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/userInsert", method = RequestMethod.POST)
    public String insertUser(UserDto userDto) throws Exception {
        System.out.println("/api/userInsert 요청은 들어오니..? 나중엔 log를 찍을거에요");
        System.out.println("userDto : " + userDto);
        userService.insertUser(userDto);

        return "user/userInsertAfter";
    }
}

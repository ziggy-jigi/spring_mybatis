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
        System.out.println("/api/userInsert 회원가입 요청은 들어오니..? 나중엔 log를 찍을거에요");
        //int checkYn =  userService.insertUserCheck(userDto); 에 따라 if문 적용하고 회원가입 시키면 될듯
        try{
            userService.insertUser(userDto);
            return "user/userInsertAfter";
        }catch (Exception e){
            e.printStackTrace();
            return "user/userInsertFail";
        }
    }
    @RequestMapping(value = "/api/userInsertCheck", method = RequestMethod.POST)
    public int insertUserCheck(UserDto userDto) throws Exception {
        int checkYn =  userService.insertUserCheck(userDto);
        return checkYn;
    }


}

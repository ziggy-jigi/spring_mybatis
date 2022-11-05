package com.jigi.user.controller;

import com.jigi.user.dto.UserDto;
import com.jigi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/api/user/userInsert", method = RequestMethod.POST)
    public String insertUser(@RequestBody UserDto userDto) throws Exception {
        System.out.println("/api/userInsert 회원가입 요청은 들어오니..? 나중엔 log를 찍을거에요");
        //int checkYn =  userService.insertUserCheck(userDto); 에 따라 if문 적용하고 회원가입 시키면 될듯
        int checkYn = userService.insertUserCheck(userDto.getUser_email());
        if (checkYn == 0) {
            try {
                userService.insertUser(userDto);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (checkYn == 1) {
            return "user/userInsertFail";
        }
        return "main/main";
    }

    @ResponseBody
    @RequestMapping(value = "/api/user/userInsertCheck", method = RequestMethod.POST)
    public int insertUserCheck(@RequestParam("userEmail") String userDto) throws Exception {
        System.out.println("/api/user/userInsertCheck 중복체크 요청은 들어오니..? 나중엔 log를 찍을거에요");
        int checkYn =  userService.insertUserCheck(userDto);
        return checkYn;
    }

//    @RequestMapping(value = "/api/userLogin", method = RequestMethod.POST)
//    public String insertLogin(UserDto userDto) throws Exception {
//        userService.userLogin(userDto);
//        return "main/main";
//    }


}

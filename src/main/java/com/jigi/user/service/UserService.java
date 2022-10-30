package com.jigi.user.service;

import com.jigi.user.dto.UserDto;
import com.jigi.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public void insertUser(UserDto userDto) throws Exception {
        userMapper.insertUser(userDto);
    }
}

package com.jigi.user.service;

import com.jigi.user.dto.UserDto;
import com.jigi.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


public interface UserService {


    public void insertUser(UserDto userDto);
}

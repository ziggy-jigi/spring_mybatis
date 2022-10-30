package com.jigi.user.service;

import com.jigi.user.dto.UserDto;
import com.jigi.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(UserDto userDto) throws Exception {
        System.out.println("여긴 타긴 타나");
        userMapper.insertUser(userDto);
    }
}

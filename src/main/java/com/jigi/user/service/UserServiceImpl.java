package com.jigi.user.service;

import com.jigi.user.dto.UserDto;
import com.jigi.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserService userService;

    @Override
    public void insertUser(UserDto userDto) {
        userService.insertUser(userDto);
    }
}

package com.jigi.user.service;

import com.jigi.user.dto.UserDto;

public interface UserService {


    public void insertUser(UserDto userDto) throws Exception;

    public int insertUserCheck(UserDto userDto) throws Exception;

}

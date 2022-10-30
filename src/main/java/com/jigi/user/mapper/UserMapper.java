package com.jigi.user.mapper;

import com.jigi.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserDto getUserById(String user_email);
    void insertUser(UserDto userDto) throws Exception;
}

package com.jigi.user.mapper;

import com.jigi.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface UserMapper {
    UserDto getUserById(String user_email);
    public void insertUser(UserDto userDto) throws Exception;
}

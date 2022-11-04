package com.jigi.user.mapper;

import com.jigi.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;


public interface UserMapper {
    public void insertUser(UserDto userDto) throws Exception;

    public int insertUserCheck(String userDto) throws Exception;
}

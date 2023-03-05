package com.example.login.mapper;

import com.example.login.dto.UserDto;
import com.example.login.model.User;
import org.modelmapper.ModelMapper;

public class UserMapper {
    public static UserDto toUserDto (User user) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(user,UserDto.class);
    }
}

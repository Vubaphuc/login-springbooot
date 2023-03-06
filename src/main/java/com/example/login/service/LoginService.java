package com.example.login.service;


import com.example.login.dto.UserDto;
import com.example.login.exception.BadRequestException;
import com.example.login.mapper.UserMapper;
import com.example.login.model.User;
import com.example.login.reponsitory.UserReponsitory;
import com.example.login.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UserReponsitory reponsitory;

    public UserDto login(LoginRequest request) {
        Optional<User> userOptional = reponsitory.getUserByRequest(request);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return UserMapper.toUserDto(user);
        }
        throw new BadRequestException("Username hoặc password chưa chính xác");
    }


}

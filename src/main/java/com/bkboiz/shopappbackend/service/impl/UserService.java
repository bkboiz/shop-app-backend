package com.bkboiz.shopappbackend.service.impl;

import com.bkboiz.shopappbackend.dto.UserDTO;
import com.bkboiz.shopappbackend.dto.UserLoginDTO;
import com.bkboiz.shopappbackend.dto.UserResponse;
import com.bkboiz.shopappbackend.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public UserResponse register(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserResponse login(UserLoginDTO userLoginDTO) {
        return null;
    }
}

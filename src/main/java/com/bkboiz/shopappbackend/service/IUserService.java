package com.bkboiz.shopappbackend.service;

import com.bkboiz.shopappbackend.dto.UserDTO;
import com.bkboiz.shopappbackend.dto.UserLoginDTO;
import com.bkboiz.shopappbackend.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    UserResponse register(UserDTO userDTO);

    UserResponse login(UserLoginDTO userLoginDTO);
}

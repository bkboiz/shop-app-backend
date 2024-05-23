package com.bkboiz.shopappbackend.service.impl;

import com.bkboiz.shopappbackend.dto.UserDTO;
import com.bkboiz.shopappbackend.dto.UserLoginDTO;
import com.bkboiz.shopappbackend.dto.UserResponse;
import com.bkboiz.shopappbackend.entity.User;
import com.bkboiz.shopappbackend.repository.UserRepository;
import com.bkboiz.shopappbackend.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final ModelMapper mapper;
    private final UserRepository userRepo;

    @Override
    public Object register(UserDTO userDTO) {
        if (userRepo.findByPhoneNumber(userDTO.getPhoneNumber()).isPresent()) {
            return ResponseEntity.badRequest().body("So dien thoai da ton tai");
        }
        User user = mapper.map(userDTO, User.class);
        return userRepo.save(user);
    }

    @Override
    public UserResponse login(UserLoginDTO userLoginDTO) {
        return null;
    }
}

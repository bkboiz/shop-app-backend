package com.bkboiz.shopappbackend.controller;

import com.bkboiz.shopappbackend.dto.UserDTO;
import com.bkboiz.shopappbackend.dto.UserLoginDTO;
import com.bkboiz.shopappbackend.service.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final IUserService IUserService;

    @PostMapping("register")
    public ResponseEntity registerUser(@Valid @RequestBody UserDTO userDTO,
                                       BindingResult result) {
        if (result.hasErrors()) {
            List<String> errMsgs = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();

            return ResponseEntity.badRequest().body(errMsgs);

        }

        return ResponseEntity.ok(IUserService.register(userDTO));
    }

    @PostMapping("login")
    public ResponseEntity login(@Valid @RequestBody UserLoginDTO userLoginDTO,
                                BindingResult result) {
        if (result.hasErrors()) {
            List<String> errMsgs = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();

            return ResponseEntity.badRequest().body(errMsgs);

        }
        return ResponseEntity.ok(IUserService.login(userLoginDTO));
    }
}

package com.bkboiz.shopappbackend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginDTO {
    @NotBlank(message = "Phone must not be a blank")
    private String phoneNumber;

    @NotBlank(message = "Password must not be a blank")
    private String password;
}

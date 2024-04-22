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
public class UserDTO {
    private String fullName;

    @NotBlank(message = "Password must not be a blank")
    private String password;

    @NotBlank(message = "Phone must not be a blank")
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
    private int fbAccountId;
    private int googleAccountId;
    private Long roleId;
}

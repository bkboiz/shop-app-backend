package com.bkboiz.shopappbackend.dto;

import jakarta.validation.constraints.Min;
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
public class OrderDTO {
    @Min(value = 1, message = "User id must be greater than 0")
   private Long userId;
   private String fullName;
   private String email;

   @NotBlank(message = "Phone is required")
   private String phoneNumber;
   private String address;
   private String note;

   @Min(value = 0, message = "Total money id must be greater than 0")
   private Float totalMoney;
   private String shippingMethod;
   private String shippingAddress;
   private String paymentMethod;
}

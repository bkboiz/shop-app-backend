package com.bkboiz.shopappbackend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailDTO {
   @Min(value = 1, message = "Order id must be greater than 0")
   private Long orderId;
   private String productId;
   @Min(value = 1, message = "Price must be greater than 0")
   private Float price;
   @Min(value = 1, message = "Quantity must be greater than 0")
   private int quantity;
   private Float totalMoney;
   private String color;
}

package com.bkboiz.shopappbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "order-details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer orderId;
    private Integer productId;
    private BigDecimal price;
    private Integer quantity;
    private BigDecimal totalMoney;
    private String color;
    private Boolean isActive;
    private Date createdAt;
    private Date updatedAt;
}

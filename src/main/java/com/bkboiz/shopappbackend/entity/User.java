package com.bkboiz.shopappbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String password;
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
    private Integer fbAccId;
    private Integer googleAccId;
    private Date createdAt;
    private Date updatedAt;
    private Boolean isActive;
    private Integer roleId;
}

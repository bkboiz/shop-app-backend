package com.bkboiz.shopappbackend.repository;

import com.bkboiz.shopappbackend.entity.SocialAccount;
import com.bkboiz.shopappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialAccountRepository extends JpaRepository<SocialAccount, Long> {
}

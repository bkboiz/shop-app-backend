package com.bkboiz.shopappbackend.controller;

import com.bkboiz.shopappbackend.dto.OrderDTO;
import com.bkboiz.shopappbackend.service.IOrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final IOrderService orderService;

    @PostMapping
    public ResponseEntity order(@Valid @RequestBody OrderDTO orderDTO,
                                BindingResult result) {
        if (result.hasErrors()) {
            List<String> errMsgs = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return ResponseEntity.badRequest().body(errMsgs);
        }

        return ResponseEntity.ok(orderService.order(orderDTO));
    }

    @GetMapping("{userId}")
    public ResponseEntity getOrderByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.findByUserId(userId));
    }
}

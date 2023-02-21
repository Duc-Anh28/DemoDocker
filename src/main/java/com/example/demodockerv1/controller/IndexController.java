package com.example.demodockerv1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class IndexController {

    @GetMapping("")
    public ResponseEntity<String> getCustomersList() {
        return ResponseEntity.ok("Nguyễn Đức Anh");
    }
}
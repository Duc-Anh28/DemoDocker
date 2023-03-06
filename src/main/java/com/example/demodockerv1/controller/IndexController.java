package com.example.demodockerv1.controller;

import com.example.demodockerv1.DAO.AccountDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/index")
public class IndexController {
    private final AccountDAO accountDAO;

    @GetMapping("")
    public ResponseEntity<?> getCustomersList() {
        return ResponseEntity.ok(accountDAO.findAll());
    }
}

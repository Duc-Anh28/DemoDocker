package com.example.demodockerv1.controller;

import com.example.demodockerv1.Service.AccountService;
import com.example.demodockerv1.repository.AccountRepository;
import com.example.demodockerv1.request.authentication.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AccountService accountService;

    @GetMapping("/signup")
    public ResponseEntity<?> signup(@Validated @RequestBody SignupRequest request) {
        accountService.signup(request);
        return ResponseEntity.ok(request);
    }
}

package com.example.demodockerv1.Service;

import com.example.demodockerv1.request.authentication.SignupRequest;

public interface AccountService {
    void signup(SignupRequest request);
}

package com.example.demodockerv1.request.authentication;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @NotBlank(message = "{email.not-blank}")
    private String email;
    @NotBlank(message = "{password.not-blank}")
    private String password;
}

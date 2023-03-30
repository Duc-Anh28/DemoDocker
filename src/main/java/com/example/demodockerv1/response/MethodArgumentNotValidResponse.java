package com.example.demodockerv1.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MethodArgumentNotValidResponse {
    private String field;
    private String message;
}

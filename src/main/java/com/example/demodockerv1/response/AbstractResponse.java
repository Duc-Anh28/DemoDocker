package com.example.demodockerv1.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractResponse {
    private int status;
    private boolean hasError;
    private String message;
}

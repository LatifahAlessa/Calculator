package com.example.Calculator.dto;

import lombok.Data;
@Data

public class OperationRequest {
    private String operation;
    private double num1;
    private double num2;
}

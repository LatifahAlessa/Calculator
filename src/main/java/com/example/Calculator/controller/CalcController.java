package com.example.Calculator.controller;

import com.example.Calculator.dto.OperationRequest;
import com.example.Calculator.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/calculator")

public class CalcController {
    private final CalcService calcService;

    //GetMapping

    //PostMapping
    @PostMapping("/d")
    public double calculate(@RequestBody OperationRequest request){
        return calcService.calculate(request.getOperation(), request.getNum1(), request.getNum2());
    }

    //PutMapping

    //DeleteMapping

}

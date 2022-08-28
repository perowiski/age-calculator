package com.demo.controller;

import com.demo.service.AgeCalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCalculatorController {
    private final AgeCalculatorService ageCalculatorService;

    public AgeCalculatorController(AgeCalculatorService ageCalculatorService){
        this.ageCalculatorService = ageCalculatorService;
    }

    @GetMapping("/howold")
    public ResponseEntity<String> calculateAge(@RequestParam(name = "dob") String dob){
        return ResponseEntity.ok(String.valueOf(ageCalculatorService.calculateAge(dob)));
    }
}

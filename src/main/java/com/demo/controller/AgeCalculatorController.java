package com.demo.controller;

import com.demo.config.TimestampAdvice;
import com.demo.service.AgeCalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class AgeCalculatorController {

    private final Logger logger = LoggerFactory.getLogger(TimestampAdvice.class);
    private final AgeCalculatorService ageCalculatorService;

    public AgeCalculatorController(AgeCalculatorService ageCalculatorService){
        this.ageCalculatorService = ageCalculatorService;
    }

    @GetMapping(value = "/howold", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> calculateAge(@RequestParam("dob") Timestamp dob){
        logger.info("Controller Timestamp: {}", dob.toString());
        return ResponseEntity.ok(String.valueOf(ageCalculatorService.calculateAge(dob)));
    }
}

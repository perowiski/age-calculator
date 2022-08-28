package com.demo.controller;

import com.demo.service.AgeCalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
public class AgeCalculatorController {
    private final AgeCalculatorService ageCalculatorService;

    public AgeCalculatorController(AgeCalculatorService ageCalculatorService){
        this.ageCalculatorService = ageCalculatorService;
    }

    @GetMapping("/howold")
    public ResponseEntity<String> calculateAge(@RequestParam(name = "dob") String dob){
        if (!isValidTimestamp(dob)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body("Invalid timestamp, supported format is yyyy:MM:dd HH:mm:ss");
        }
        return ResponseEntity.ok(String.valueOf(ageCalculatorService.calculateAge(dob)));
    }

    public static boolean isValidTimestamp(String dob) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
            sdf.setLenient(false);
            sdf.parse(dob);
        }catch (Exception e) {
            return false;
        }
        return true;
    }
}

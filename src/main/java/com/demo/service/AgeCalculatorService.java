package com.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeCalculatorService {
    public int calculateAge(String dob) {
        return Period.between(LocalDate.parse(dob), LocalDate.now()).getYears();
    }
}

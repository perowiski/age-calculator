package com.demo.service;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeCalculatorService {
    public int calculateAge(String dob) {
        return Period.between(Timestamp.valueOf(dob).toLocalDateTime().toLocalDate(), LocalDate.now()).getYears();
    }
}

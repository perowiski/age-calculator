package com.demo.service;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

@Service
public class AgeCalculatorService {
    public int calculateAge(Timestamp dob) {
        return Period.between(dob.toLocalDateTime().toLocalDate(), LocalDate.now()).getYears();
    }
}

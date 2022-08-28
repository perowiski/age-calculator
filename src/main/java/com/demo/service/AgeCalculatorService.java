package com.demo.service;

import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Service
public class AgeCalculatorService {
    public int calculateAge(String dob) {
        LocalDateTime localDateTime = Timestamp.valueOf(dob).toLocalDateTime();
        return Period.between(localDateTime.toLocalDate(), LocalDate.now()).getYears();
    }
}

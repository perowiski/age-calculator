package com.demo.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AgeCalculatorServiceTest {
    private final AgeCalculatorService underTest;

    public AgeCalculatorServiceTest(){
        underTest = new AgeCalculatorService();
    }

    @Test
    public void itShouldCalculateAge(){
        String dob = "1986-08-05";
        int expectedAge = 36;
        int result = underTest.calculateAge(dob);
        assertThat(result).isEqualTo(expectedAge);
    }
}

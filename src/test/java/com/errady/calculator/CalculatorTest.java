package com.errady.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    @Test
    void additionTest(){
        Calculator cl = new Calculator();
        int sum = cl.add(6, 4);
        assertEquals(10, sum);
    }

    @Test
    void divisionTest(){
        Calculator cl = new Calculator();
        String div = cl.devide(15, 5);
        assertEquals("3", div);
    }

    @Test
    void division_0_Test(){
        Calculator cl = new Calculator();
        String div= cl.devide(20, 0);
        assertEquals("Error!", div);
    }
}
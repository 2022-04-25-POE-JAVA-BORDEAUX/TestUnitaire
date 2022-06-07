package com.poe.demotestunitaire.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(1, 2);
        
        assertEquals(3, result);
    }
    
}

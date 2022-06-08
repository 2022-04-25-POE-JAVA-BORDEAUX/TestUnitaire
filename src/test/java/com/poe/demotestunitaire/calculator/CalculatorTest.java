package com.poe.demotestunitaire.calculator;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    
    @Test
    public void testAdd3plus2retourne5() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(3, 2);
        
        assertEquals(5, result);
    }
    
    @Test
    public void testAdd2plus1retourne3() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(2, 1);
        
        assertEquals(3, result);
    }
    
    
    @Test
    public void testAdd0plus0retourne0() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(0, 0);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testAddMoinsCinqAndMoins4retourneMoinsNeuf() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(-5, -4);
        
        assertEquals(-9, result);
    }
    
    @Test
    public void testGrandNombres() {
         Calculator calculator = new Calculator();
        
        int result = calculator.add(5000, 10000);
        
        assertTrue(result == 15000);
    }
    
    @Test
    public void testDeuxObjets() {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        
        c1 = c2;
        
        assertSame(c1, c2);
    }
    
    @Test
    public void testMaxBetweenOneAndTwo()
    {
        Calculator calculator = new Calculator();
        
        int result = calculator.max(1, 2);
        
        assertEquals(2, result);
    }
    @Test
    public void testMaxBetweenMinusOneAndMinusTwo()
    {
        Calculator calculator = new Calculator();
        
        int result = calculator.max(-1, -2);
        
        assertEquals(-1, result);
    }
    @Test
    public void testMaxBetweenSameValues(){
        Calculator calculator = new Calculator();
        
        int result = calculator.max(2, 2);
        
        assertEquals(2, result);   
    }
    
    @Test
    public void testDivideWithIntResult(){
        Calculator calculator = new Calculator();
        
        int result = calculator.divide(10, 5);
        
        assertEquals(2, result);        
    }
    @Test
    public void testDivideWithFloatResult(){
        Calculator calculator = new Calculator();
        
        int result = calculator.divide(10, 3);
        System.out.println(result);
        
        assertEquals(10/3, result);
    }
    
    @Test
    public void testDivideWithDividerAsZero(){
        Calculator calculator = new Calculator();
        
        assertThrows( ArithmeticException.class , () -> {
             calculator.divide(10, 0);
        });
       
    }
    
    @Test
    public void testGetNombresImpairs() {
        
        assertTrue(false);
    }
}

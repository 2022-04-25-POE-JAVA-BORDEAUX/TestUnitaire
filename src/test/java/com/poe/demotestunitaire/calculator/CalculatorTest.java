package com.poe.demotestunitaire.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculatorTest {
    
    @Test
    public void testAdd3plus2retourne5() {
        
        int result = Calculator.add(3, 2);
        
        assertEquals(5, result);
    }
    
    @Test
    public void testAdd2plus1retourne3() {
        
        int result = Calculator.add(2, 1);
        
        assertEquals(3, result);
    }
    
    
    @Test
    public void testAdd0plus0retourne0() {
        int result = Calculator.add(0, 0);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testAddMoinsCinqAndMoins4retourneMoinsNeuf() {
        int result = Calculator.add(-5, -4);
        
        assertEquals(-9, result);
    }
    
    @Test
    public void testGrandNombres() {        
        int result = Calculator.add(5000, 10000);
        
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
        int result = Calculator.max(1, 2);
        
        assertEquals(2, result);
    }
    @Test
    public void testMaxBetweenMinusOneAndMinusTwo()
    {
        int result = Calculator.max(-1, -2);
        
        assertEquals(-1, result);
    }
    @Test
    public void testMaxBetweenSameValues(){
        int result = Calculator.max(2, 2);
        
        assertEquals(2, result);   
    }
    
    @Test
    public void testDivideWithIntResult(){
        int result = Calculator.divide(10, 5);
        
        assertEquals(2, result);        
    }
    @Test
    public void testDivideWithFloatResult(){
        int result = Calculator.divide(10, 3);
        System.out.println(result);
        
        assertEquals(10/3, result);
    }
    
    @Test
    public void testDivideWithDividerAsZero(){
        assertThrows( ArithmeticException.class , () -> {
             Calculator.divide(10, 0);
        });
       
    }
    
    @Test
    public void testGetNombresImpairs() {
        ArrayList<Integer> result = Calculator.getNombresImpairs(5);
        
        assertEquals(3, result.size());
        
        assertTrue(result.contains(3));
        assertFalse(result.contains(2));
        
        assertTrue(result.containsAll(Arrays.asList(1, 3, 5)));
        
        ArrayList<Integer> target = new ArrayList<>();
        target.addAll(Arrays.asList(1, 3, 5));
        assertEquals(result.toString(), target.toString());
    }
    
    //EXEMPLES avec des PARAMS
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testParametreAvecValueSource(int valeur) {
        assertEquals(valeur + valeur, valeur * 2);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "1, 2", "2, 3"})
    void testAdditioner(int a, int b) {
        int attendu = a + b;
        assertEquals(attendu, a + b);
    }
    
    @ParameterizedTest
    @CsvSource({"1, 1, 2", "1, 2, 3", "2, 3, 5"})
    void testAdditionerAvecResultat(int a, int b, int result) {
        assertEquals(result, a + b);
    }
        
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "1, 2, 2", "5, 3, 5", "-1, -4, -1"})
    void testMaxAvecJeuDeDonnees(int a, int b, int result) {
        assertEquals(result, Calculator.max(a, b));
    }
}

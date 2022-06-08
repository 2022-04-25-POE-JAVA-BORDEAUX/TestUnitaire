package com.poe.demotestunitaire.games;

import games.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    
    @Test
    public void testFizzBuzz15() {
        assertEquals("FizzBuzz", FizzBuzz.play(15));
    }
    
    @Test
    public void testFizzBuzz3() {
        assertEquals("Fizz", FizzBuzz.play(3));
    }
    
     @Test
    public void testFizzBuzz5() {
        assertEquals("Buzz", FizzBuzz.play(5));
    }
    
     @Test
    public void testFizzBuzz2() {
        assertEquals("2", FizzBuzz.play(2));
    }
    
}

package com.poe.demotestunitaire.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeTest {
    
    @Test
    public void PalindromeTest() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("kayak");
        
        assertTrue(result);
    }
    
}

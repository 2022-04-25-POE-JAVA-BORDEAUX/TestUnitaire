package com.poe.demotestunitaire.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;


public class PalindromeTest {
    
    
    @Test
    public void isPalindromeKayak() {
        boolean result = Palindrome.isPalindrome("kayak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeBonjour() {
        boolean result = Palindrome.isPalindrome("bonjour");
        
        assertFalse(result);
    }
    
        
    @Test
    public void isPalindromeChaineVide() {
        boolean result = Palindrome.isPalindrome("");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeKAYak() {
        boolean result = Palindrome.isPalindrome("KAYak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeAvecEspaces() {
        boolean result = Palindrome.isPalindrome("Engage le jeu que je le gagne");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeAvecDesAccents() {
        boolean result = Palindrome.isPalindrome("La mariée ira mal");
        
        assertTrue(result);
    }
}

package com.poe.demotestunitaire.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeTest {
    
    @Test
    public void isPalindromeKayak() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("kayak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeBonjour() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("bonjour");
        
        assertFalse(result);
    }
    
        
    @Test
    public void isPalindromeChaineVide() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeKAYak() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("KAYak");
        
        assertTrue(result);
    }
    
    @Test
    public void isPalindromeAvecEspaces() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("Engage le jeu que je le gagne");
        
        assertTrue(result);
    }
    
        
    @Test
    public void isPalindromeAvecDesAccents() {
        Palindrome palindrome = new Palindrome();
        
        boolean result = palindrome.isPalindrome("La mariée ira mal");
        
        assertTrue(result);
    }
}

package com.poe.demotestunitaire.calculator;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    
    public int add(int a, int b){
        return a + b;
    }
    
    public int max(int a, int b){
        return a > b ? a : b;
    }
    
    public int divide(int dividende, int diviseur){
        
        return dividende/diviseur;
    }
    
    // getOddNumbers()
    // odd = impairs = bizarre
    public ArrayList<Integer> getNombresImpairs(int max){
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0 ; i <= max ; i++) {
            if(i % 2 != 0)
                result.add(i);
        }
        
        return result;
    }

    
}

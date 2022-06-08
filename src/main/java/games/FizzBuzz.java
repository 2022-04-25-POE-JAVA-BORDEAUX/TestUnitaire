package games;

public class FizzBuzz {
    
    public static String play(int number){
        
        //if(number % 3 == 0 && number % 5 == 0)
        if(number % 15 == 0)
            return "FizzBuzz";
        if(number  % 3 == 0)
            return "Fizz";
        if(number  % 5 == 0)
            return "Buzz";
        
        return ""+number;
    }
}

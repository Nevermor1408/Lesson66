
package JARFILES;

public class GuessMachine {
    private int number;
    private int numGuesses;
    private int guess;
    
    
    public GuessMachine(){
        number =(int)(Math.random()*100)+1;
        guess = 0;
        numGuesses = 0;  
    }
    //String givehint()
    //int getnumguesses()
    //boolean setGuess()
    
    public String givehint(){
        if(guess<number)return"too low";
        else if (guess > number)return "too high";
        else return "you got it";
        
    }
    public boolean setGuess (int g)
    {
        if(g<1||g >100 )return false;
        else{
            numGuesses++;
            guess=g;
            return true;
            
        }
    }
    public int getNumGuesses()
    {
        return numGuesses;
    }
    }
//


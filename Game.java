

import java.util.Random;
public class Game {
    private int minRange;
    private int maxRange;
    private int numberToGuess;
    private int maxAttempts;
    private int AttemptsLeft;

    public Game(int minRange,int maxRange,int maxAttempts){
        this.minRange=minRange;
        this.maxRange=maxRange;
        this.numberToGuess=numberToGuess;
        this.maxAttempts=maxAttempts;
        this.AttemptsLeft=maxAttempts;
        
    }

    public void generateNumber(){
        Random random=new Random();
        numberToGuess=random.nextInt(maxRange-minRange+1)+minRange;
    }

    public boolean guessNumber(int guess){
        AttemptsLeft--;
        if(guess<numberToGuess){
            System.out.println("Too Low!");
            return false;
        }
        else if(guess>numberToGuess){
            System.out.println("Too High!!");
            return false;
        }
        else{
            System.out.println("Hooray!! You have cracked the code");
            return true;
        }
    }
    public boolean hasAttemptsLeft(){
        return AttemptsLeft>0;
    }
    public int howmanyAttemptsLeft(){
        return AttemptsLeft;
    }
}

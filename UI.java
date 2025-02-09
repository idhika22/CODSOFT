
import java .util.Scanner;
public class UI {
    private Scanner sc=new Scanner(System.in);

    public void showWelcomeMeaage(){
        System.out.println("Welcome to spy game!!");
        System.out.println("Guess the correct number to crack the code :)");
    }
    public int  getGuess(){
        System.out.println("Enter your guess:");
        return sc.nextInt();
    }

    public void showAttemptsLeft(int attemptsLeft){
        System.out.println("Attempts Left:"+attemptsLeft);
    }

    public void showWinningMessage(int attempts){
        System.out.println("You are awesome spy !! your score is "+ attempts );
    }

    public void showGameOverMessage(){
        System.out.println("Game Over!!You've run out of attempts");
    }

    public boolean AskToPlayAgain(){
        System.out.println("Do you want to play again(yes/no):");
        String response=sc.next();
        return response.equals("yes");
    }
}


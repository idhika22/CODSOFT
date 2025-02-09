
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    boolean playAgain=true;
    while(playAgain){
        System.out.println("Enter minrange:");
        int minrange=scanner.nextInt();
        System.out.println("Enter maxrange:");
        int maxrange=scanner.nextInt();
        System.out.println("Enter attempts:");
        int maxattempts=scanner.nextInt();

        Game game=new Game(minrange,maxrange,maxattempts);
        UI ui=new UI();
        ui.showWelcomeMeaage();
        game.generateNumber();

        int attempts=0;
        boolean correctGuess=false;
        while(!correctGuess && game.hasAttemptsLeft()){
            ui.showAttemptsLeft(game.howmanyAttemptsLeft());
            int guess=ui.getGuess();
            correctGuess=game.guessNumber(guess);
            attempts++;
        }
        if(correctGuess){
            ui.showWinningMessage(attempts);
        }
        else{
            ui.showGameOverMessage();
        }
        playAgain=ui.AskToPlayAgain();
    }
    scanner.close();
    System.out.println("Thank you!!");
}
}

package game;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hey, let's play Rock, Paper, Scissors!" +
                " Please enter a move." + " Rock=1, Paper" +
                "=2 and Scissors=3.");
        int PlayerScore=0;
        int PCScore=0;
        while(true) {
            System.out.print("Your Choice: ");
            int playerChoice = s.nextInt();
            int pcChoice = (int)(Math.random()*3);
            if (playerChoice == 1) {
                if (pcChoice == 1) {
                    System.out.println("Computer Choice:Rock, Result:Draw");
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                } else if (pcChoice == 2) {
                    System.out.println("Computer Choice:Paper, Result:Lost");
                    PCScore++;
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                } else {
                    System.out.println("Computer Choice:Scissors, Result:You win");
                    PlayerScore++;
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                }
            } else if (playerChoice == 2) {
                if (pcChoice == 1) {
                    System.out.println("Computer Choice: Rock, Result:Draw");
                    PlayerScore++;
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                } else if (pcChoice == 2) {
                    System.out.println("Computer Choice: Paper, Result:Lost");
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                } else {
                    System.out.println("Computer Choice: Scissors, Result:You win");
                    PCScore++;
                    System.out.println("Your Score:"+ PlayerScore+ " PC Score:"+PCScore); }
            } else if (playerChoice == 3) {
                if (pcChoice == 1) {
                    System.out.println("Computer Choice:Rock, Result:Draw");
                    PCScore++;
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                } else if (pcChoice == 2) {
                    System.out.println("Computer Choice:Paper, Result:Lost");
                    PlayerScore++;
                    System.out.println("Your Score:"+PlayerScore+ " PC Score:"+PCScore);
                } else {
                    System.out.println("Computer Choice:Scissors, Result:You win");
                    System.out.println("Your Score:"+ PlayerScore+ " PC Score:"+PCScore);
                }
            } else{
                System.out.println("You have logged in incorrectly, try again!");
                continue;}
            if(PlayerScore==5){
                System.out.println("You won the game "+PlayerScore+"-"+PCScore);
                break; }
            else if(PCScore==5){
                System.out.println("You lost the game "+PCScore+"-"+PlayerScore);
                break; }
        }
    }
}


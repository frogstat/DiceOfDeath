import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        GameClass diceOfDeath = new GameClass(dice);

        Player player1 = new Player("Felix", 100, 0,0);
        Player player2 = new Player("Eric", 100, 0,0);

        System.out.println("Welcome to Dice of Death!");

        game: while(true) {
            while (player1.getHealth() > 0 && player2.getHealth() > 0) {
                System.out.println("**************************");
                System.out.println(player1.getHealthInfo());
                System.out.println(player2.getHealthInfo());
                System.out.print("Type roll to play round: ");
                if (scanner.nextLine().equalsIgnoreCase("roll")) {
                    diceOfDeath.playRound(player1, player2);
                }
            }
            Player winner = player1.getHealth() > 0 ? player1 : player2;
            winner.addGamesWon();
            System.out.println("Score: " + player1.getName() + ": " +  player1.getGamesWon());
            System.out.println("Score: " + player2.getName() + ": " +  player2.getGamesWon());
            System.out.println(winner.getName() + " wins!");
            String answer = "";
            while(!answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n")){
                System.out.print("Play again? y/n: ");
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    player1.resetStats();
                    player2.resetStats();
                    continue game;
                } else if(answer.equalsIgnoreCase("n")) {
                    break game;
                }
                else{
                    System.out.println("Please enter y or n");
                }
            }
        }
        if(player1.getGamesWon() > player2.getGamesWon()){
            System.out.println(player1.getName() + " has won the war of dice! With the score " + player1.getGamesWon());
        }
        else if (player1.getGamesWon() < player2.getGamesWon()){
            System.out.println(player2.getName() + " has won the war of dice! With the score " + player2.getGamesWon());
        }
        else{
            System.out.println("The die is tie");
        }
    }
}

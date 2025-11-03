import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        GameClass diceOfDeath = new GameClass(dice);

        Player player1 = new Player("Felix", 100, 0,0);
        Player player2 = new Player("Eric", 100, 0,0);

        System.out.println("Welcome to Dice of Death!");
        System.out.println("**************************");

        while(player1.getHealth() > 0 || player2.getHealth() > 0){
            System.out.println(player1.getHealthInfo());
            System.out.println(player2.getHealthInfo());
            System.out.print("Type roll to play round: ");
            if(scanner.nextLine().equalsIgnoreCase("roll")){
                diceOfDeath.playRound(player1, player2);
            }
        }

    }
}

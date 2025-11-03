public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        Player player1 = new Player("Felix", 100, 0,0);
        Player player2 = new Player("Eric", 100, 0,0);

        System.out.println("Welcome to Dice of Death!");
        System.out.println("**************************");
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());

        while(player1.getHealth() > 0 || player2.getHealth() > 0){






        }

    }
}

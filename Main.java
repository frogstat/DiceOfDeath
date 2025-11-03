public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Welcome to Dice of Death!");
        System.out.println("**************************");
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());

        while(player1.getHealth > 0 || player2.getHealth > 0){






        }

    }
}

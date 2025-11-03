public class GameClass {

    private Dice dice;


    public GameClass(Dice dice){
        this.dice = dice;
    }

    public int playRound(Player player1, Player player2){
        int resultPlayer1 = dice.rollDice();
        int resultPlayer2 = dice.rollDice();
        return resultPlayer1 - resultPlayer2; // negative = player 2 wins.
    }

}

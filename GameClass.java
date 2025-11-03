public class GameClass {

    private Dice dice;


    public GameClass(Dice dice){
        this.dice = dice;
    }

    public int getWinner(Player player1, Player player2){
        int resultPlayer1 = dice.rollDice();
        System.out.println(player1.getName() + " rolled " + resultPlayer1);
        int resultPlayer2 = dice.rollDice();
        System.out.println(player2.getName() + " rolled " + resultPlayer2);
        return resultPlayer1 - resultPlayer2; // negative = player 2 wins.
    }

    public void playRound(Player player1, Player player2){

        int result = getWinner(player1, player2);
        if(result > 0){
            player2.takeDamage(result* player1.getAttack()*player2.getDefense());
        }
        else if(result<0){
            player1.takeDamage((result*-1)* player2.getAttack()*player1.getDefense());
        }
        else if(result == 0){
            System.out.println("It's a tie!");
        }
    }
    public void getReward(Player player) {
       Dice dice = new Dice();
        switch (dice.rollDice()) {
            case 1 ->{ player.setDefense(player.getDefense() / 2); 
            System.out.println("Celebrated to soon bitch, you may have won this rond but you leave as half a man");}
            case 2 -> System.out.println("Fucking nothing");
            case 3 -> System.out.println("HAHAHHAHA, winners lose");
            case 4 -> player.setAttack(player.getAttack()* 1.5);
            
           
            
        }
    }

}

import java.util.*;

public class Dice {

    private int sidesOfDice;

    public Dice(int sidesOfDice){
        this.sidesOfDice = sidesOfDice;
    }

    public Dice(){
        this.sidesOfDice = 6;
    }

    public int getSidesOfDice(){
        return sidesOfDice;
    }

    public int rollDice(){
        Random random = new Random();
        return random.nextInt(sidesOfDice) + 1;
    }

}

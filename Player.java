public class Player {
    private String name;
    private double health;
    private double attack;
    private double defense;
    private int gamesWon;



    public Player(String name, double health, int gamesWon) {
        this.name = name;
        this.health = health;
        this.attack = 1;
        this.defense = 1;
        this.gamesWon = 0;

    }

    public void resetStats(){
        health = 100;
        attack = 1;
        defense = 1;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void addGamesWon() {
        this.gamesWon++;
    }

    public String getHealthInfo(){
        if(health > 75){
            return String.format("%s looks fokking strong! HP: %.1f. ATK: %.1f. DEF: %.1f", name, health, attack, defense);
        }
        else if (health > 50){
            return String.format("%s looks injured, are you okay? HP: %.1f. ATK: %.1f. DEF: %.1f", name, health, attack, defense);
        }
        else if (health > 25){
            return String.format("%s this is bound to go to the shitters! HP: %.1f. ATK: %.1f. DEF: %.1f", name, health, attack, defense);
        }
        else if (health > 0){
            return String.format("%s is blinded by the blood of his broken spirit! HP: %.1f. ATK: %.1f. DEF: %.1f", name, health, attack, defense);
        }
        else{
            return String.format("%s is DEAAAAAD, pff! HP: %.1f. ATK: %.1f. DEF: %.1f", name, health, attack, defense);
        }
    }

    public void takeDamage(double dmg) {
        this.health -= dmg;
    }

    public boolean isAlive() {
        return this.health > 0;
    }





    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public double getHealth() {
        return health;
    }



    public void setHealth(double health) {
        this.health = health;
    }



    public double getAttack() {
        return attack;
    }



    public void setAttack(double attack) {
        this.attack = attack;
    }



    public double getDefense() {
        return defense;
    }



    public void setDefense(double defense) {
        this.defense = defense;
    }
}

public class Player {
    private String name;
    private double health;
    private double attack;
    private double defense;

    public Player(String name, double health, int highScore, int gamesPlayed) {
        this.name = name;
        this.health = health;
        this.attack = 1;
        this.defense = 1;

    }

    public String getHealthInfo(){
        if(health > 75){
            return name + " looks good! HP: " + health;
        }
        else if (health > 50){
            return name + " looks okay. HP: " + health;
        }
        else if (health > 25){
            return name + " looks bad, man. HP: " + health;
        }
        else if (health > 0){
            return name + " looks almost dead... Uh oh! HP: " + health;
        }
        else{
            return name + " is dead. RIP HP: " + health;
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

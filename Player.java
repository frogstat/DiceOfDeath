public class Player {
    private String name;
    private int health;
    private double attack;
    private double defense;

    public Player(String name, int health, int highScore, int gamesPlayed) {
        this.name = name;
        this.health = health;
        this.attack = 1;
        this.defense = 1;

    }

    public String getHealthInfo(){
        if(health > 75){
            return name + " looks good!";
        }
        else if (health > 50){
            return name + " looks okay.";
        }
        else if (health > 25){
            return name + " looks bad, man.";
        }
        else if (health > 0){
            return name + " looks almost dead... Uh oh!";
        }
        else{
            return name + " is dead. RIP";
        }
    }

    public void takeDamage(int dmg) {
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



    public int getHealth() {
        return health;
    }



    public void setHealth(int health) {
        this.health = health;
    }



    public double getAttack() {
        return attack;
    }



    public void setAttack(int attack) {
        this.attack = attack;
    }



    public double getDefense() {
        return defense;
    }



    public void setDefense(int defense) {
        this.defense = defense;
    }
}

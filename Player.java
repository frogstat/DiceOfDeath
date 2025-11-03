public class Player {
    private String name;
    private int health;
    private int attack;
    private int defense;

    public Player(String name, int health, int highScore, int gamesPlayed) {
        this.name = name;
        this.health = health;

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



    public int getAttack() {
        return attack;
    }



    public void setAttack(int attack) {
        this.attack = attack;
    }



    public int getDefense() {
        return defense;
    }



    public void setDefense(int defense) {
        this.defense = defense;
    }
}

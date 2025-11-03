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
}

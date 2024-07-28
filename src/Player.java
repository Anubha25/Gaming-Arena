package src;

public class Player {
    private int health;
    public final int strength;
    public final int attack;

    // Parameterized constructor
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void health_harm(int damage)
    {health+=damage;}

}

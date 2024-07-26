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

    // Getter for strength
    public int getStrength() {
        return strength;
    }

    // Getter for attack
    public int getAttack() {
        return attack;
    }
    
    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

}

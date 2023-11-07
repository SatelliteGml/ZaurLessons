package Heroes;

import lombok.Data;

@Data
public class Enemy {
    private String name;
    private int health;

    public Enemy(String name, int heath) {
        this.name = name;
        this.health = heath;
    }

    public void takeDamage(int damage) {
        this.health -= Math.min(health, damage);
    }
}

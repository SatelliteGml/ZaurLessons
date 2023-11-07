package Heroes;

import lombok.Data;

@Data
public class Enemy implements Mortal {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int heath, int damage) {
        this.name = name;
        this.health = heath;
        this.damage = damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(name + " is defeat");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(name + " takes " + damage + " dmg " + ".Left  " + health + " HP\n");
        }
    }
}

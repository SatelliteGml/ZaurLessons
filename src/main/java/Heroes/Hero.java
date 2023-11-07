package Heroes;

import lombok.Data;

@Data
public abstract class Hero {
    private String name;
    private int damage;
    private int health;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);
}

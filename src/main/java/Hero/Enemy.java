package Hero;

import lombok.Data;

@Data
public class Enemy {
    private String name;
    private int healthPoint;
    private int damage;
    private int reincarnation;

    public Enemy(String name, int healthPoint, int damage, int reincarnation) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.damage = damage;
        this.reincarnation = reincarnation;
    }

    public void takeDamage(Hero hero){
    }
}

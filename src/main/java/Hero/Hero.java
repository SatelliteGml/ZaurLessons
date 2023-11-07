package Hero;

import Weapon.Weapon;
import lombok.Data;

@Data
public abstract class Hero<T extends Weapon> {
    private String name;
    private String armor;
    private int healthPoint;
    private int reincarnation;

    public Hero(String name, String armor, int healthPoint, int reincarnation) {
        this.name = name;
        this.armor = armor;
        this.healthPoint = healthPoint;
        this.reincarnation = reincarnation;
    }
    public abstract void attackEnemy(Enemy enemy);
}

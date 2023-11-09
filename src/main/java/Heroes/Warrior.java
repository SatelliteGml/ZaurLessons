package Heroes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Warrior extends Hero {
    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attack " + enemy.getName() + " with DemonSlasher");
        enemy.takeDamage(getDamage());
    }
}

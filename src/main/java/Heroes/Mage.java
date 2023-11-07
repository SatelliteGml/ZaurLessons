package Heroes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mage extends Hero {
    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attack " + enemy.getName() + " with fireball");
        enemy.takeDamage(getDamage());
    }
}

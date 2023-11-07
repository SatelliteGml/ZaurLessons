package Hero;

import Weapon.Wand;

public class Magic<T extends Wand> extends Hero<T>{
    private Wand wand;
    public Magic(String name, String armor, int healthPoint, int reincarnation, Wand wand) {
        super(name, armor, healthPoint, reincarnation);
        this.wand = wand;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " use " + wand.getName() + " give " + wand.getDamage() +
                " damage to " + enemy.getName());
    }
}

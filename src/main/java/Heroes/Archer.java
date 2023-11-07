package Heroes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Archer extends Hero implements Mortal {
    private Wolf wolf;
    public Archer(String name, int damage, int health) {
        super(name, damage, health);
        this.wolf = new Wolf("Volchonok",50);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " attack " + enemy.getName() + " with cursed arrow");
        wolf.attackEnemy(enemy);
    }
    @Data
    private class Wolf{
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
        public void attackEnemy(Enemy enemy){
            System.out.println(name + " and " + Archer.this.getName() + " give damage");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}

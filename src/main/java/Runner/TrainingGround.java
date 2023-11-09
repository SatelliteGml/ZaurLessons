package Runner;

import Heroes.*;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy diablo = new Enemy("Diablo", 3000,300);
        Hero warrior = new Warrior("Illidan", 100, 1500);
        Hero archer = new Archer("Legolaz", 150, 1350);
        Hero mage = new Mage("Gendalf", 200, 1000);


        attackEnemy(diablo, warrior, archer, mage);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}

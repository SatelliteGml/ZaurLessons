package AppRunner;

import Hero.Enemy;
import Hero.Magic;
import Weapon.Wand;

public class HeroRunner {
    public static void main(String[] args) {
        Wand wandA = new Wand("SuperWand", 780);
        Magic<Wand> archemage = new Magic<>("Archemage", "LightCrownArmor",1500,3, wandA);

        Enemy enemy = new Enemy("Diablo", 5000, 500,5);
        archemage.attackEnemy(enemy);

    }
}

package Runner;

import Heroes.*;

import java.util.ArrayList;
import java.util.List;

public class TrainingGround {
    public static void main(String[] args) {
        Enemy diablo = new Enemy("Diablo", 500);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("SuperMan"));
        heroes.add(new Archer("Legolaz"));
        heroes.add(new Mage("ArcheMage"));
        heroes.add(new Warrior("Illidan"));

        attackEnemy(heroes);

    }

    public static void attackEnemy(List<Hero> heroes) {
        for (Hero hero : heroes) {
            hero.attackEnemy();
        }
    }
}

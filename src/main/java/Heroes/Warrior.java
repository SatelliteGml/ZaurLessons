package Heroes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " attack with sword");
    }
}

package Heroes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " attack with mage");
    }
}

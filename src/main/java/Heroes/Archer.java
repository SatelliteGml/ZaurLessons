package Heroes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(getName() + " attack with bow");
    }
}

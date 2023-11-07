package Weapon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wand extends Weapon {
    public Wand(String name, int damage) {
        super(name, damage);
    }

}

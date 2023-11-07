package Weapon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sword extends Weapon{
    public Sword(String name, int damage) {
        super(name, damage);
    }
}

package Weapon;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bow extends Weapon{
    public Bow(String name, int damage) {
        super(name, damage);
    }
}

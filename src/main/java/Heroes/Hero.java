package Heroes;

import lombok.Data;

@Data
public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println(name + " attack ");
    }
}

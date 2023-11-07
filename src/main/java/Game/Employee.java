package Game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Participant{
    public Employee(String name, int age) {
        super(name, age);
    }
}

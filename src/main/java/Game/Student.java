package Game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Participant{
    public Student(String name, int age) {
        super(name, age);
    }
}

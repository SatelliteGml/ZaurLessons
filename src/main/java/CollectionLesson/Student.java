package CollectionLesson;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Person{
    private int course;
    private String groupName;

    public Student(String name, int age, int course, String groupName) {
        super(name, age);
        this.course = course;
        this.groupName = groupName;
    }
}

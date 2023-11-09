package CollectionLesson;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.age - o.age;
        if (result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}

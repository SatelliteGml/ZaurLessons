package CollectionLesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Artur",35,4,"it"));
        studentList.add(new Student("Art",33,3,"worker"));
        studentList.add(new Student("Ar",31,1,"b1"));
        studentList.add(new Student("Ar1",35,1,"b1"));
        studentList.add(new Student("Adur",12,1,"b1"));
        studentList.add(new Student("Den",30,3,"worker"));
        studentList.add(new Student("Yura",45,3,"worker"));
        studentList.add(new Student("Alla",33,4,"it"));
        studentList.add(new Student("Sophia",15,4,"it"));
        studentList.add(new Student("Boris",41,3,"worker"));
        studentList.add(new Student("Anton",33,4,"it"));

        Collections.sort(studentList);
        studentGroupSort(studentList);
    }
    public static void studentGroupSort(List<Student> studentList){
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGroupName().equalsIgnoreCase("b1")){
                list1.add(student);
            } else if (student.getGroupName().equalsIgnoreCase("it")) {
                list2.add(student);
            }else {
                list3.add(student);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}

import Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Do Hieu",19,"Ha Noi",18,"13A"));
        students.add(new Student(2,"Khanh Linh",20,"Ha Noi ",15,"13A"));
        students.add(new Student(3,"Bui Hien",25,"Thai Binh",4,"13B" ));
        students.add(new Student(4,"Con Vuon",22,"Dac So",3,"13A"));

        students.sort((Comparator.comparing(student -> ((Student)student).getAge()).thenComparing(student ->((Student)students)
                .getId())));
        students.forEach(student -> System.out.println(student.toString()));

//        System.out.println(studentList.toString());
    }
}

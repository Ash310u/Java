package school;

import school.staff.Teacher;
import school.student.Student;

public class school {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ashu", 22),
            new Student("Ritwik", 25)
        };

        Teacher[] teachers = {
            new Teacher("Soumita Maam", "OOPs"),
            new Teacher("Kallol Sir", "OOPs")
        };

        System.out.println("------School------\n");
        System.out.println("-----Students-----");
        for (Student student : students) {
            student.display();
        }

        System.out.println("-----Teachers-----");
        for (Teacher teacher : teachers) {
            teacher.display();
        }
    }
}

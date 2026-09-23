class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class PassDemo {
    static void changeValue(int num) {
        num = 100;
    }

    static void changeReference(Student student) {
        student.name = "Rahul";
    }
} 

public class PassByDemo {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before: " + number);
        PassDemo.changeValue(number);
        System.out.println("After: " + number);

        Student student = new Student("Ashu");
        System.out.println("Before: " + student.name);
        PassDemo.changeReference(student);
        System.out.println("After: " + student.name);
    }
}

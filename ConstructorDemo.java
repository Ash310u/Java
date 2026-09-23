// 1. Write a program in Java to implement all different types of constructor.

class Student {
    String name;
    int age;

    Student() {
        this.name = "Student";
        this.age = 22;
    }

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        
        Student student = new Student("John", 20);
        student.display();
        Student student2 = new Student(student);
        student2.display();
        Student student1 = new Student();
        student1.display();
    
    }
}
package school.student;

import school.ShowValue;

public class Student implements ShowValue {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
    }
}

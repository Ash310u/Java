package school.staff;

import school.ShowValue;

public class Teacher implements ShowValue {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Teacher name: " + name);
        System.out.println("Subject: " + subject);
    }
}

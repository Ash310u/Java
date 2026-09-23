// Example of hierarchical inheritance in Java (short form)
class Employee {
    String name;
    void show() {
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {}

class HR extends Employee {}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Manager";
        m.show();

        HR h = new HR();
        h.name = "HR";
        h.show();
    }
}
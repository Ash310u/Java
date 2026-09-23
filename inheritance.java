class Employee {
    String name;
    int id;

    void details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Manager extends Employee {
    Boolean auth = true;

    void details() {
        super.details();
        System.out.println("Auth Access: " + auth);
    }
}

public class inheritance {
    public static void main (String arg[]) {
        Employee e1 = new Employee();
        e1.name = "ashu";
        e1.id = 2;

        e1.details();

        Manager e2 = new Manager();

        e2.name = "Amit";
        e2.id = 1;

        e2.details();
    }
}
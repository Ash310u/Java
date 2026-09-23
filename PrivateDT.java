class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.department = "";
        this.salary = 0.0;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
    }
}

class PrivateDT {
    public static void main(String[] args) {
        int n = 3;
        Manager[] managers = new Manager[n];
        managers[0] = new Manager(1, "Ashu", "IT", 50000, 8000);
        managers[1] = new Manager(2, "Rick", "HR", 47000, 12000);
        managers[2] = new Manager(3, "Azkah", "Finance", 52000, 9000);

        // double maxTotalSalary = managers[0].getTotalSalary();
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            // if (managers[i].getTotalSalary() > maxTotalSalary) {
            //     maxTotalSalary = managers[i].getTotalSalary();
            //     maxIndex = i;
            // }
            System.out.println("Manager with maximum total salary:");
            managers[maxIndex].display();
            System.out.println("\n");
        }
    }
}
import java.util.Scanner;

class EMPLOYEE {
    int employeeNumber;
    String employeeName;
    double basicSalary;
    double da;
    double incomeTax;
    double netSalary;

    EMPLOYEE() {
        employeeNumber = 0;
        employeeName = "";
        basicSalary = 0.0;
        da = 0.0;
        incomeTax = 0.0;
        netSalary = 0.0;
    }

    void readEmployeeDetails(Scanner sc) {
        System.out.print("Enter employee number: ");
        employeeNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();

        calculateNetSalary();
    }

    void calculateNetSalary() {
        da = 0.52 * basicSalary;
        double grossSalary = basicSalary + da;
        incomeTax = 0.30 * grossSalary;
        netSalary = grossSalary - incomeTax;
    }

    void displayEmployeeDetails() {
        System.out.println("\nEmployee Number: " + employeeNumber);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA: " + da);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EMPLOYEE employee1 = new EMPLOYEE();
        EMPLOYEE employee2 = new EMPLOYEE();
        EMPLOYEE employee3 = new EMPLOYEE();

        System.out.println("Enter details for Employee 1");
        employee1.readEmployeeDetails(sc);

        System.out.println("\nEnter details for Employee 2");
        employee2.readEmployeeDetails(sc);

        System.out.println("\nEnter details for Employee 3");
        employee3.readEmployeeDetails(sc);

        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
        employee3.displayEmployeeDetails();

        sc.close();
    }
}
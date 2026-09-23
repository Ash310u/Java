import java.util.*;

abstract class Vehicle {
    static int nextNumber = 100001;
    int vehicleNumber;
    String companyName;
    double price;

    Vehicle(String c, double p) {
        companyName = c;
        price = p;
        vehicleNumber = nextNumber++;
    }

    abstract void display();
}

class LightMotorVehicle extends Vehicle {
    double mileage;
    LightMotorVehicle(String c, double p, double m) { super(c, p); mileage = m; }
    void display() {
        System.out.printf("No: %d | Light | %s | %.2f | %.2f km/l%n", vehicleNumber, companyName, price, mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacity;
    HeavyMotorVehicle(String c, double p, double cap) { super(c, p); capacity = cap; }
    void display() {
        System.out.printf("No: %d | Heavy | %s | %.2f | %.2f tons%n", vehicleNumber, companyName, price, capacity);
    }
}

public class vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Vehicle[] v = new Vehicle[n];
        for (int i = 0; i < n;) {
            int t = sc.nextInt(); sc.nextLine();
            String c = sc.nextLine();
            double p = sc.nextDouble();
            if (t == 1) v[i++] = new LightMotorVehicle(c, p, sc.nextDouble());
            else if (t == 2) v[i++] = new HeavyMotorVehicle(c, p, sc.nextDouble());
            sc.nextLine();
        }
        for (Vehicle ve : v) ve.display();
    }
}
import java.util.*;

abstract class Vehicle {
    private static int nextNumber = 100001;
    protected int vehicleNumber;
    protected String companyName;
    protected double price;

    Vehicle(String c, double p) {
        this.companyName = c;
        this.price = p;
        this.vehicleNumber = nextNumber++;
    }

    abstract void display();
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    LightMotorVehicle(String c, double p, double m) { 
        super(c, p); 
        this.mileage = m; 
    }

    @Override
    void display() {
        System.out.printf("No: %d | Light | %s | %.2f | %.2f km/l%n", vehicleNumber, companyName, price, mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacity;

    HeavyMotorVehicle(String c, double p, double cap) { 
        super(c, p); 
        this.capacity = cap; 
    }

    @Override
    void display() {
        System.out.printf("No: %d | Heavy | %s | %.2f | %.2f tons%n", vehicleNumber, companyName, price, capacity);
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Invalid number of vehicles.");
            sc.close();
            return;
        }
        Vehicle[] v = new Vehicle[n];
        for (int i = 0; i < n; ) {
            try {
                int t = Integer.parseInt(sc.nextLine().trim());
                String c = sc.nextLine().trim();
                double p = Double.parseDouble(sc.nextLine().trim());
                if (t == 1) {
                    double m = Double.parseDouble(sc.nextLine().trim());
                    v[i++] = new LightMotorVehicle(c, p, m);
                } else if (t == 2) {
                    double cap = Double.parseDouble(sc.nextLine().trim());
                    v[i++] = new HeavyMotorVehicle(c, p, cap);
                } else {
                    System.out.println("Invalid vehicle type. Must be 1 (Light) or 2 (Heavy).");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter data in correct format.");
            }
        }
        for (Vehicle ve : v) ve.display();
        sc.close();
    }
}
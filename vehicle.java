class Vehicle {
    protected static long nextNumber = 100001;
    protected long uniqueNumber;
    protected String companyName;
    protected double price;

    public Vehicle(String companyName, double price) {
        this.uniqueNumber = nextNumber++;
        this.companyName = companyName;
        this.price = price;
    }

    public void display() {
        System.out.println("Vehicle Number: " + uniqueNumber);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    public LightMotorVehicle(String companyName, double price, double mileage) {
        super(companyName, price);
        this.mileage = mileage;
    }

    @Override
    public void display() {
        System.out.println("--- Light Motor Vehicle ---");
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println();
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacityInTons;

    public HeavyMotorVehicle(String companyName, double price, double capacityInTons) {
        super(companyName, price);
        this.capacityInTons = capacityInTons;
    }

    @Override
    public void display() {
        System.out.println("--- Heavy Motor Vehicle ---");
        super.display();
        System.out.println("Capacity: " + capacityInTons + " tons");
        System.out.println();
    }
}

public class vehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new LightMotorVehicle("Honda", 700000, 22.5);
        vehicles[1] = new HeavyMotorVehicle("Tata", 3500000, 10.5);
        vehicles[2] = new LightMotorVehicle("Suzuki", 550000, 18.0);

        System.out.println("Vehicle Information:\n");
        for (Vehicle v : vehicles) {
            v.display();
        }
    }
}
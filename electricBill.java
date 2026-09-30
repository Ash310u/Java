interface ElectricityBill {
    double calculateBill(int units);
}

class DomesticConnection implements ElectricityBill {
    public double calculateBill(int units) {
        double amount = 0.0;
        if (units <= 100) {
            amount = units * 3.0;
        } else if (units <= 300) {
            amount = 100 * 3.0 + (units - 100) * 5.0;
        } else {
            amount = 100 * 3.0 + 200 * 5.0 + (units - 300) * 7.0;
        }
        return amount;
    }
}

class CommercialConnection implements ElectricityBill {
    public double calculateBill(int units) {
        double amount = 0.0;
        if (units <= 100) {
            amount = units * 5.0;
        } else if (units <= 300) {
            amount = 100 * 5.0 + (units - 100) * 8.0;
        } else {
            amount = 100 * 5.0 + 200 * 8.0 + (units - 300) * 10.0;
        }
        return amount;
    }
}

public class electricBill {
    public static void main(String[] args) {
        int domesticUnits = 350;
        int commercialUnits = 350;

        ElectricityBill domestic = new DomesticConnection();
        ElectricityBill commercial = new CommercialConnection();

        System.out.println("--- Domestic Connection ---");
        System.out.println("Units Consumed: " + domesticUnits);
        System.out.println("Bill Amount: Rs. " + domestic.calculateBill(domesticUnits));

        System.out.println("\n--- Commercial Connection ---");
        System.out.println("Units Consumed: " + commercialUnits);
        System.out.println("Bill Amount: Rs. " + commercial.calculateBill(commercialUnits));
    }
}

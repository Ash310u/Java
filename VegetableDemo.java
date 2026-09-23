interface vegetable {
    void color();
    void whgrow();
}

class spinach implements vegetable {
    public void color() {
        System.out.println("Spinach is green.");
    }

    public void whgrow() {
        System.out.println("Spinach grows above ground.");
    }
}

class potato implements vegetable {
    public void color() {
        System.out.println("Potato is brown.");
    }

    public void whgrow() {
        System.out.println("Potato grows underground.");
    }
}

class onion implements vegetable {
    public void color() {
        System.out.println("Onion is white.");
    }

    public void whgrow() {
        System.out.println("Onion grows underground.");
    }
}

class tomato implements vegetable {
    public void color() {
        System.out.println("Tomato is red.");
    }

    public void whgrow() {
        System.out.println("Tomato grows above ground.");
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        vegetable[] vegetables = {new spinach(), new potato(), new onion(), new tomato()};

        for (vegetable item : vegetables) {
            item.color();
            item.whgrow();
        }
    }
}

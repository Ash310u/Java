class animal {
    void sound() {
        System.out.println("Animal Can create sound.");
    }
}

class dog extends animal {
    void sound() {
        System.out.println("dog barks");
    }
}

public class override {
    public static void main(String[] args) {
        animal a = new animal();
        dog d = new dog();

        a.sound();
        d.sound();
    }
}
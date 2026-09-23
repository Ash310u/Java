interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MultipleInheritanceDemo implements Printable, Showable {
    public void print() {
        System.out.println("Printing data.");
    }

    public void show() {
        System.out.println("Showing data.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MultipleInheritanceDemo object = new MultipleInheritanceDemo();
        object.print();
        object.show();
    }
}

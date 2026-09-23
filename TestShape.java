abstract class Shape {
    double area;

    abstract void calArea();
    abstract void display();
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void calArea() {
        area = l * b;
    }

    void display() {
        System.out.printf("Rectangle Area: %.2f\n", area);
    }
}

class Triangle extends Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    void calArea() {
        area = 0.5 * b * h;
    }

    void display() {
        System.out.printf("Triangle Area: %.2f\n", area);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        rect.calArea();
        rect.display();

        Triangle tri = new Triangle(4, 8);
        tri.calArea();
        tri.display();
    }
}
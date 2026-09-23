import java.util.*;

class circle {
    double radius;
    circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
     
        double radius = scanner.nextDouble();
        circle c = new circle(radius);
     
        System.out.println("Area of the circle: " + c.area());
        System.out.println("Circumference of the circle: " + c.circumference());
     
        scanner.close();
    }
}
import java.util.Scanner;

class Cal {
    double volume(double length, double width, double height) {
        return length * width * height;
    }

    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,w,h,r;
        
        System.out.println("Enter l,w,h,r:");
        l = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        r = sc.nextInt();
        
        Cal Cal = new Cal();
        
        System.out.println("Volume of rectangular: " + Cal.volume(l,w,h));
        System.out.println("Volume of cylinder: " + Cal.volume(l, w));
        System.out.println("Volume of sphere: " + Cal.volume(r));
    }
}

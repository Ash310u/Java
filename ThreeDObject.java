/*
Problem (in short): 
Create a Java program which demonstrates hierarchical polymorphism/inheritance for 3D objects. 
Base class defines area() and volume() methods, which are overridden in derived classes: Box, Cube, Cylinder, Cone. 
The program should input different dimensions for each 3D object, and display their respective surface areas and volumes.
*/


import java.util.*;

class ThreeDObject {
    void area() { System.out.println("Area N/A"); }
    void volume() { System.out.println("Volume N/A"); }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        // Read all double values at once
        double boxL = sc.nextDouble();
        double boxW = sc.nextDouble();
        double boxH = sc.nextDouble();

        double cubeS = sc.nextDouble();

        double cylR = sc.nextDouble();
        double cylH = sc.nextDouble();

        double coneR = sc.nextDouble();
        double coneH = sc.nextDouble();

        Box b = new Box(boxL, boxW, boxH);
        b.area(); b.volume();

        Cube cu = new Cube(cubeS);
        cu.area(); cu.volume();

        Cylinder cy = new Cylinder(cylR, cylH);
        cy.area(); cy.volume();

        Cone co = new Cone(coneR, coneH);
        co.area(); co.volume();

        sc.close();
    }
}

class Box extends ThreeDObject {
    double l, w, h;
    Box(double l, double w, double h) { this.l=l; this.w=w; this.h=h; }
    void area()   { System.out.printf("Box Area: %.2f\n", 2*(l*w+w*h+h*l)); }
    void volume() { System.out.printf("Box Vol: %.2f\n", l*w*h); }
}

class Cube extends ThreeDObject {
    double s;
    Cube(double s) { this.s = s; }
    void area()   { System.out.printf("Cube Area: %.2f\n", 6*s*s); }
    void volume() { System.out.printf("Cube Vol: %.2f\n", s*s*s); }
}

class Cylinder extends ThreeDObject {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    void area()   { System.out.printf("Cylinder Area: %.2f\n", 2*Math.PI*r*(r+h)); }
    void volume() { System.out.printf("Cylinder Vol: %.2f\n", Math.PI*r*r*h); }
}

class Cone extends ThreeDObject {
    double r, h;
    Cone(double r, double h) { this.r = r; this.h = h; }
    void area()   { double s=Math.sqrt(h*h+r*r); System.out.printf("Cone Area: %.2f\n", Math.PI*r*(r+s)); }
    void volume() { System.out.printf("Cone Vol: %.2f\n", (Math.PI*r*r*h)/3); }
}
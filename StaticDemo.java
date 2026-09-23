// 2. Write a program in Java to show uses of static block, static variable and static method.

class Static {
    static int count = 0;

    Static() {
        count++;
    }

    static void display() {
        System.out.println(count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Static demo = new Static();
        demo.display();
    }
}
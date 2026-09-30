package pack1;

public class Test1 {
    public static void main(String[] args) {
        C1 c1 = new C1(1, 2, 3, 4);
        C2 c2 = new C2(5, 6, 7, 8);

        System.out.println("C1 object: a=" + c1.a + ", c=" + c1.c + ", d=" + c1.d);
        System.out.println("Test1 cannot access c1.b because b is private in C1.");
        System.out.println("C2 object: a=" + c2.a + ", c=" + c2.c + ", d=" + c2.d);
        System.out.println("Test1 cannot access c2.b because b is private in C1.");
        c1.display();
        c2.displayDirectAccess();
    }
}

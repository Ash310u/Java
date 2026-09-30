package pack1;

public class C2 extends C1 {
    public C2(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public void displayDirectAccess() {
        System.out.println("C2 direct access: a=" + a + ", c=" + c + ", d=" + d);
        System.out.println("C2 cannot access b directly because b is private in C1.");
    }
}

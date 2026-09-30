package pack1;

public class C1 {
    int a;
    private int b;
    public int c;
    protected int d;

    public C1(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void display() {
        System.out.println("C1: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
    }
}

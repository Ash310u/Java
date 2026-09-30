package pack2;

import pack1.C1;
import pack1.C2;

public class Test2 {
    public static void main(String[] args) {
        C1 c1 = new C1(1, 2, 3, 4);
        C2 c2 = new C2(5, 6, 7, 8);
        C3 c3 = new C3();
        C4 c4 = new C4(9, 10, 11, 12);

        System.out.println("C1 object: c=" + c1.c);
        System.out.println("C2 object: c=" + c2.c);
        System.out.println("C4 object: c=" + c4.c);
        System.out.println("Test2 cannot access a, b, or d through C1, C2, or C4 objects outside pack1.");
        c3.displayAccess(c1);
        c4.displayAccess(c1);
    }
}

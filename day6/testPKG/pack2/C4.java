package pack2;

import pack1.C1;

public class C4 extends C1 {
    public C4(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public void displayAccess(C1 c1) {
        System.out.println("C4 inherited direct access: c=" + c + ", d=" + d);
        System.out.println("C4 cannot access inherited a because a has default access in pack1.");
        System.out.println("C4 cannot access inherited b because b is private in C1.");
        System.out.println("C4 through C1 object: c=" + c1.c);
        System.out.println("C4 cannot access c1.a because a has default access in pack1.");
        System.out.println("C4 cannot access c1.b because b is private in C1.");
        System.out.println("C4 cannot access c1.d because protected access across packages requires the subclass instance.");
    }
}

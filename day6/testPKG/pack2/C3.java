package pack2;

import pack1.C1;

public class C3 {
    public void displayAccess(C1 c1) {
        System.out.println("C3 direct access: c=" + c1.c);
        System.out.println("C3 cannot access a because a has default access in pack1.");
        System.out.println("C3 cannot access b because b is private in C1.");
        System.out.println("C3 cannot access d because d is protected and C3 is not a subclass.");
    }
}

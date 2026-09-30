final class FinalClass {
    void showFinalClass() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    final void showFinalMethod() {
        System.out.println("This is a final method.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        final int maximumMarks = 100;
        System.out.println("Final variable: " + maximumMarks);

        Parent parent = new Parent();
        parent.showFinalMethod();

        FinalClass finalClass = new FinalClass();
        finalClass.showFinalClass();
    }
}

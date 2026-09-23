class Parent {
    int value = 10;

    Parent() {
        System.out.println("Parent constructor invoked");
    }

    void display() {
        System.out.println("Parent method invoked");
    }
}

class Child extends Parent {
    int value = 20;

    Child() {
        super(); 
        System.out.println("Child constructor invoked");
    }

    void show() {
        System.out.println("Parent value: " + super.value);
        System.out.println("Child value: " + this.value);

        super.display();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
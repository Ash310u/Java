// 3 .Write a program in Java to show the different uses of this keyword to do the following.
// Each use should be commented accurately.


// i) Unhide instance variable from local variable
class variables {
    int value = 10;

    void display() {
        int value = 40;

        System.out.println("Instance variable: " + this.value);
        System.out.println("Local variable: " + value);
    }
}

// ii) Invoke Current Class Constructors
class InvokeConstructor {
    String name;
    int age;

    public InvokeConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    InvokeConstructor () {
        this("ashu", 22);
    }
}

// iii) Return the Current Class Object
class returnObject {
    public returnObject getMe() {
        return this; 
    }
}

// iv) Pass the Current Object as a Method Argument
class MethodArgument {
    void show(MethodArgument obj) {
        System.out.println("Check object reference is same as current: " + (this == obj));
    }

    void callShow() {
        show(this);
    }
}

// v) Invoke Current Class Methods
class InvokeMethods {
    void display() {
        System.out.println("Display method called");
    }
    void callDisplay() {
        this.display();
    }
}


public class KeywordDemo {
    public static void main(String[] args) {
        variables variables = new variables();
        variables.display();
        
        InvokeConstructor student = new InvokeConstructor();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        
        returnObject obj1 = new returnObject();
        returnObject obj2 = obj1.getMe();

        System.out.println(obj1 == obj2); 
    
        MethodArgument methodArgument = new MethodArgument();
        methodArgument.callShow();

        InvokeMethods invokeMethods = new InvokeMethods();
        invokeMethods.callDisplay();
    }
}


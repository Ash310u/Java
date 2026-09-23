class COMPLEX {
    int real;
    int imaginary;

    COMPLEX(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    COMPLEX ADD(COMPLEX s1, COMPLEX s2) {
        return new COMPLEX(s1.real + s2.real, s1.imaginary + s2.imaginary);
    }

    COMPLEX ADD(int a, COMPLEX s2) {
        return new COMPLEX(a + s2.real, s2.imaginary);
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real+"+" + imaginary + "i");
        } else {
            System.out.println(real +"-"+ (-imaginary) + "i");
        }
    }
}

public class Complex {
    public static void main(String[] args) {
        COMPLEX s1 = new COMPLEX(33, 2);
        COMPLEX s2 = new COMPLEX(9, 3);
        
        COMPLEX calc = new COMPLEX(0, 0);
        COMPLEX sum1 = calc.ADD(s1, s2);
        COMPLEX sum2 = calc.ADD(5, s2);

        System.out.print("s1 = ");
        s1.display();
        System.out.print("s2 = ");
        s2.display();

        System.out.print("ADD(s1, s2) = ");
        sum1.display();

        System.out.print("ADD(5, s2) = ");
        sum2.display();
    }
}

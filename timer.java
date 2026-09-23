import java.util.Scanner;

class Time {
    int h, m, s;

    void read() {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
    }

    void show() {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Invalid time");
            return;
        }
        int disp = (h == 0 || h == 12) ? 12 : h % 12;
        String p = (h < 12) ? "AM" : "PM";
        System.out.printf("%d:%02d:%02d %s%n", disp, m, s, p);
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.read();
        t.show();
    }
}
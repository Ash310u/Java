import java.util.*;

class Student {
    String name;
    String regNumber;
    class Subject {
        String subjectName;
        int marks;

    }

    Subject[] subjects = new Subject[3];
    void read(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }
    
    
    void display() {
        System.out.println("\n Name: " + name);
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Subjects: ");
        for (Subject subject : subjects) {
            System.out.println(subject.subjectName + ": " + subject.marks);
        }
    }

    void average() {
        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.marks;
        }
        System.out.println("Average Marks: " + totalMarks / subjects.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student s = new Student();
        
        System.out.println("Enter the name of the student: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter the registration number of the student: ");
        String regNumber = scanner.nextLine();
        
        System.out.println("Enter subject details as Subject:Marks, separated by commas:");
        System.out.println("Example: Maths:85,Physics:90");
        
        String subjectDetails = scanner.nextLine();
        String[] details = subjectDetails.split(",");

        if (details.length != s.subjects.length) {
            System.out.println("Please enter exactly " + s.subjects.length + " subjects.");
            scanner.close();
            return;
        }

        for (int i = 0; i < 3; i++) {
            String[] subjectAndMark = details[i].trim().split(":");

            s.subjects[i] = s.new Subject();
            s.subjects[i].subjectName = subjectAndMark[0].trim();
            s.subjects[i].marks = Integer.parseInt(subjectAndMark[1].trim());
        }

        s.read(name, regNumber);
        s.display();
        s.average();
        scanner.close();
    }
}

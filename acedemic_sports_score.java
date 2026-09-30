interface Academic {
    double academicScore();
}

interface Sports {
    double sportsScore();
}

class Student implements Academic, Sports {
    private double academicMarks;
    private double sportsMarks;

    public Student(double academicMarks, double sportsMarks) {
        this.academicMarks = academicMarks;
        this.sportsMarks = sportsMarks;
    }

    public double academicScore() {
        return academicMarks;
    }

    public double sportsScore() {
        return sportsMarks;
    }

    public double overallScore() {
        return academicScore() + sportsScore();
    }

    public static void main(String[] args) {
        Student s = new Student(80.5, 18.5);
        System.out.println("Academic Score: " + s.academicScore());
        System.out.println("Sports Score: " + s.sportsScore());
        System.out.println("Overall Score: " + s.overallScore());
    }
}
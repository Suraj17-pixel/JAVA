package student_contrutor_data;

class Student {
    String stuname;
    int marks;

    // Parameterized constructor for Student
    Student(String x) {
        stuname = x;
    }

    void printStudent() {
        System.out.println("Student name = " + stuname);
    }
}

class Marks extends Student {
    int hindi, english;

    // Parameterized constructor for Marks
    Marks(String x, int h, int e) {
        super(x); // Call superclass constructor
        hindi = h;
        english = e;
    }

    void printMarks() {
        System.out.println("Marks = hindi: " + hindi + ", english: " + english);
    }
}

class Result extends Marks {

    Result(String x, int h, int e) {
        super(x, h, e); 
    }

    void printResult() {
        int total = hindi + english;
        System.out.println("Result = " + total);
    }
}

public class p1{
    public static void main(String[] args) {

        Result R1 = new Result("Jaimin", 65, 97);

        R1.printStudent();
        R1.printMarks();
        R1.printResult();
    }
}
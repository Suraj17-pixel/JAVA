package student_constructor_data;

class Student {
    String studentname;
    int no;
    int english, hindi;

    Student(int x, int y, String z, int w) 
    {
        english = x;
        no = y;
        studentname = z;
        hindi = w;
    }

    void printdata() {
        System.out.println("Student name: " + studentname + ", No: " + no + ", Hindi: " + hindi + ", English: " + english);
    }
}

public class p1 {

    public static void main(String[] args) {
        // Creating Student objects with provided data
        Student s1 = new Student(78, 1, "Jaimin", 87);
        Student s2 = new Student(99, 2, "Suraj", 76);
        Student s3 = new Student(74, 3, "Riken", 81);
        Student s4 = new Student(56, 4, "Ansh", 77);
        Student s5 = new Student(87, 5, "Aditya", 94);

        // Printing the data of each student
        s1.printdata();
        s2.printdata();
        s3.printdata();
        s4.printdata();
        s5.printdata();
    }
}

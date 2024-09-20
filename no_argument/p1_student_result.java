package no_argument;

class Student 
{
    String stuname;
    int marks;

    Student() 
    {
        
    }

    void setStudentName(String x) 
    {
        stuname = x;
    }

    void printStudent() 
    {
        System.out.println("Student name = " + stuname);
    }
}

class Marks extends Student 
{
    int hindi, english;

    Marks() 
    {
      
    }

    void setMarks(int hindi, int english) 
    {
        this.hindi = hindi;
        this.english = english;
    }

    void printMarks() 
    {
        System.out.println("Marks = hindi: " + hindi + ", english: " + english);
    }
}

class Result extends Marks 
{
    Result() 
    {

    }

    void printResult() 
    {
        int total = hindi + english;
        System.out.println("Result = " + total);
    }
}

public class p1_student_result {
    public static void main(String[] args) 
    {

        Result R1 = new Result();

        R1.setStudentName("Jaimin");
        R1.setMarks(65, 97);

        R1.printStudent();
        R1.printMarks();
        R1.printResult();
    }
}

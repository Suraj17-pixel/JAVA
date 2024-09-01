package jDemos1;

import java.util.Scanner;

class Student
{
	int no;
	String name;
	
	void setstudent()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr name of student: = ");
		name = scanner.nextLine();
		
		System.out.print("Enter no of student: = ");
		no = scanner.nextInt();
		
	}
	
	void printstudent()
	{
		System.out.println("Student name =" + name);
		System.out.println("Student no =" + no);
	}
}

class Marks extends Student
{
	int e,h;
	
	void setmarks()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr marks of english: = ");
		e = scanner.nextInt();
		
		System.out.print("Enetr marks of hindi: = ");
		h = scanner.nextInt();
		
	}
	
	void printmarks()
	{
		System.out.println("English marks " + e);
		System.out.println("Hindi marks " + h);
	}
}

class Result extends Marks
{
	void totalmarks()
	{
	    System.out.println("Total marks: " + (e + h));
    }
}


public class p91_student_inheritence_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Result R1 = new Result();
		 
		 R1.setstudent();
		 R1.setmarks();
		 
		 R1.printstudent();
		 R1.printmarks();
		 
		 R1.totalmarks();
		 
	}

}

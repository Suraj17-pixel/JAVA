package jDemos1;

import java.util.Scanner;

class student
{
	int no;
	String name;
	
	void setdata()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr name of student: = ");
		name = scanner.nextLine();
		
		
	}
	
	void printdata()
	{
		System.out.println("Student name =" + name);
	}
}

class Marks extends student
{
	int e,h;
	
	void setdata()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enetr marks of english: = ");
		e = scanner.nextInt();
		
		System.out.print("Enetr marks of hindi: = ");
		h = scanner.nextInt();
		
	}
	
	void printdata()
	{
		System.out.println("English marks " + e);
		System.out.println("Hindi marks " + h);
	}
}

class Result extends Marks
{
	void printresult()
	{
	    System.out.println("Total marks: " + (e + h));
    }
}


public class p96_herical_inheritence_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Result R1 = new Result();
		 
		 R1.setdata();
		 R1.printdata();
		 
		 R1.printresult();
		 
	}

}

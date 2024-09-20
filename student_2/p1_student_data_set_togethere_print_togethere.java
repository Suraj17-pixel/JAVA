package student_2;

import java.util.Scanner;

class Student 
{
	String name;
	static int x;
	int no;

	void setdata()
	{
		Scanner sc=new Scanner(System.in);

        
        System.out.print("Enter stname =>");
        name=sc.next();
        
        x++;
        no = x;
	}
	
	void printdata()
	{
		System.out.println(" Student no = " + no + " Student name = " + name );
		
	}
	static void printCount()
	{
		System.out.println(" X = " + x);
	}
}

public class p1_student_data_set_togethere_print_togethere {

	public static void main(String[] args) {
		
		Student st1 =new Student();
	    Student st2 =new Student();
	    Student st3 =new Student();
	    
	    st1.setdata();
	    st2.setdata();
	    st3.setdata();
	    st1.printdata();
	    st2.printdata();
	    st3.printdata();

	    Student.printCount();
	}

}

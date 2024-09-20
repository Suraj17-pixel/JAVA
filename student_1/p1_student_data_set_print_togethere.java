package student_1;

import java.util.Scanner;

class Student 
{
	String name;
	int no;
	static int x;
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter stno =>");
        no=sc.nextInt();
        
        System.out.print("Enter stname =>");
        name=sc.next();
        
        x++;
	}
	
	void printdata()
	{
		System.out.println(" Student no = " + no + " Student name = " + name + " X = " +x);
	
	}
}

public class p1_student_data_set_print_togethere {

	public static void main(String[] args) {
		
		Student st1 =new Student();
	    Student st2 =new Student();
	    Student st3 =new Student();
	    
	    st1.setdata();
	    
	    st1.printdata();
	    st2.printdata();
	    st3.printdata();
	    
	    st2.setdata();
	    
	    st1.printdata();
	    st2.printdata();
	    st3.printdata();
	    
	    st3.setdata();
	    
	    st1.printdata();
	    st2.printdata();
	    st3.printdata();

	}

}

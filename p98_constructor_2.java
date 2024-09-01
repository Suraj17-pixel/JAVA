package jDemos1;

import java.util.Scanner;

class emps
{
    String empname;
    int salary;
    int no;
    
    emps()
    {
    	empname="ram";
    	salary=12000;
    	no=5;
    }
    emps(int x,String y,int z)
    {
    	no=x;
    	empname=y;
    	salary=z;
    	
    }
    

    void printdata() 
    {
        System.out.println("Empname: " + empname + " Empno: " + no + " Salary: " + salary);
    }
}

public class p98_constructor_2 {
    public static void main(String[] args) 
    {
        emps e1 = new emps();
        emps e2 = new emps();
        emps e3 = new emps();
        emps e4 = new emps(1,"raja",3000);
        emps e5 = new emps(2,"mahi",4000);

        e1.printdata();
        e2.printdata();
        e3.printdata();
        e4.printdata();
        e5.printdata();
    }
}

package jDemos1;

import java.util.*;
class emp
{
    int eno;
    String ename;

    void setdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter eno =>");
        eno=sc.nextInt();
        System.out.print("Enter ename =>");
        ename=sc.next();
        

    }
    void printdata()
    {
        System.out.println("Eno = " + eno + " Ename = " + ename);
    }
}

public class p85_employee_data{
public static void main(String args[])
{

    emp e1=new emp();
    emp e2=new emp();
    emp e3=new emp();
    e1.setdata();
    e2.setdata();
    e3.setdata();

    e1.printdata();
    e2.printdata();
    e3.printdata();


}


}
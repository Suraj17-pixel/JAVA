package jDemos1;

import java.util.Scanner;
class stu
{
    int stno;
    String stname;
    String stenglish;
    String sthindi;

    void setdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter stno =>");
        stno=sc.nextInt();
        
        System.out.print("Enter stname =>");
        stname=sc.next();
        
        System.out.print("Enter stenglish =>");
        stenglish=sc.next();
        
        System.out.print("Enter sthindi =>");
        sthindi=sc.next();
        

    }
    void printdata()
    {
        System.out.println("Stno = " + stno + " Stname = " + stname + " Stenglish = " + stenglish + " Sthindi = " + sthindi);
    }
}

public class p86_student_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    stu st1=new stu();
		    stu st2=new stu();
		    stu st3=new stu();
		    
		    st1.setdata();
		    st2.setdata();
		    st3.setdata();

		    st1.printdata();
		    st2.printdata();
		    st3.printdata();


	}

}

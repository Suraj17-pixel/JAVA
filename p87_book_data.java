package jDemos1;

import java.util.Scanner;
class book
{
    int bookno;
    
    int bookid;
    String bookname;
    String bookprice;

    void setdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter boid =>");
        bookid=sc.nextInt();
        
        System.out.print("Enter boname =>");
        bookname=sc.next();
        
        System.out.print("Enter boprice =>");
        bookprice=sc.next();
 
    

    }
    void printdata()
    {
        System.out.println("Bookid = " + bookid + " Bookname = " + bookname + " Bookprice = " + bookprice);
    }
}

public class p87_book_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book book1=new book();
	    book book2=new book();
	    book book3=new book();
	    
	    book1.setdata();
	    book2.setdata();
	    book3.setdata();

	    book1.printdata();
	    book2.printdata();
	    book3.printdata();


	}

}

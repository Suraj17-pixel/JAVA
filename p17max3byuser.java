package jDemos1;

import java.util.Scanner;

public class p17max3byuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n1 =>");
			n1=sc.nextInt();
			
			System.out.print("Enter n2 =>");
			n2=sc.nextInt();
			
			System.out.print("Enter n3 =>");
			n3=sc.nextInt();
		}
		
	    if(n1>n2)
		{
			System.out.println("n1 is maximum");
		}

		else if(n2>n3)
		{
			System.out.println("n2 is maximum");
		}
		
		else
		{
			System.out.println("n3 is maximum");
		}

	}

}

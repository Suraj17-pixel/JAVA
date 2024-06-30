package jDemos1;

import java.util.Scanner;

public class p16oddevenbyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n =>");
			n=sc.nextInt();
		}
		 
		if(n%2==0)
		{
			System.out.println("n is even");
		}
		else
		{
			System.out.println("n is odd");
		}
	}

}

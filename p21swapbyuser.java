package jDemos1;

import java.util.Scanner;

public class p21swapbyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2;
		
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n1 =>");
			 n1=sc.nextInt();

			 System.out.print("Enter n2 =>");
			 n2=sc.nextInt();
		}
			
		 System.out.println("After swapping: n1 = " + n2 + ", n2 = " + n1);
	}

}

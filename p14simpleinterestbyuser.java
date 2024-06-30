package jDemos1;

import java.util.Scanner;

public class p14simpleinterestbyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amt,rate,time;
		
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter amt =>");
			amt=sc.nextInt();
			
			System.out.print("Enter rate =>");
			rate=sc.nextInt();
			
			System.out.print("Enter time =>");
			time=sc.nextInt();
		}
		
	    System.out.println("Simple interest = " + (amt*rate*time/100));
	}

}

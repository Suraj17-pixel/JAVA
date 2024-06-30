package jDemos1;

import java.util.Scanner;

public class p11calcbyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n1,n2;
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter np1 =>");
			n1=sc.nextInt();
			
			System.out.print("Enter np2 =>");
			n2=sc.nextInt();
		}
		
		System.out.println("addition= " + (n1+n2));
		System.out.println("sunstraction= " + (n1-n2));
		System.out.println("multplication= " + (n1*n2));
		System.out.println("divsion= " + (n1/n2));

	}

}

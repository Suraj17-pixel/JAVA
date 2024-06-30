package jDemos1;

import java.util.Scanner;

public class p18posneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n =>");
			n=sc.nextInt();
		}
		
	    if(n>0)
		{
			System.out.println("positive");
		}
		
		else
		{
			System.out.println("negative");
		}

	}

}

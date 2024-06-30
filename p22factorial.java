package jDemos1;

import java.util.Scanner;

public class p22factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number : ");
			number = sc.nextInt();
		}
	    int answer = factorial(number);
	    System.out.println("factorial of " + number + " is " + answer);
	    
	    	}
	static int factorial(int n) {
		if(n == 1)
			return 1;
		return n * factorial(n-1);
	}
	    
	}
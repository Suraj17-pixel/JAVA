package jDemos1;

import java.util.Scanner;

public class P12areaoftrianglebyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int h,b;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter h =>");
			h=sc.nextInt();
			
			System.out.print("Enter b =>");
			b=sc.nextInt();
		}
		
		System.out.println("Area of triangle = " + (h*b*0.5));

	}

}

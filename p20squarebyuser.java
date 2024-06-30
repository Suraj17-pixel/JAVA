package jDemos1;

import java.util.Scanner;

public class p20squarebyuser {

	public static void main(String[] args) {
		
	int i,n;
		
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter n =>");
	    n=sc.nextInt();
	}
		
	    
	    for(i=1;i<=n;i++)
		{
			System.out.printf("%d ======== %d \n",i , i*i);
		}
			

	}

}

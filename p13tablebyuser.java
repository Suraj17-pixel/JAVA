package jDemos1;

import java.util.Scanner;

public class p13tablebyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n,i;
		
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n =>");
			n=sc.nextInt();
		}
		
		for(i=1;i<=10;i++)
		{
			System.out.printf("%d X %d = %d \n", n, i, n * i);

	}

	}

}

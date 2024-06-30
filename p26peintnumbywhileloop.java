package jDemos1;

import java.util.Scanner;

public class p26peintnumbywhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,i = 0;
		
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter limit =>");
			num=sc.nextInt();
		}
		
		while(i<=num)
		{
			System.out.printf("%d\n", +i);
			
			i++;
		}

	}

}

package jDemos1;

import java.util.Scanner;

public class p28reversenumbywhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int num,r;
			
			 try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter limit =>");
				num=sc.nextInt();
			}
			
			while(num>0)
			{
				r=num%10;
				System.out.println(r);
				
				num=num/10;
			}

		}

	}
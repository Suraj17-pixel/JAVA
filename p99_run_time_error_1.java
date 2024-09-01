package jDemos1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p99_run_time_error_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			int no1,no2,c;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter no1 : ");
			no1= sc.nextInt();
			
			System.out.print("\nEnter no2 : ");
			no2= sc.nextInt();
			
			
			c = no1/no2;
			
			System.out.println(" C => " + c);

			
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Why u enter string");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Why u enter 0");
		}
		catch(Exception ex2)
		{
			System.out.println("Error : " + ex2.toString());
		}
	}

}

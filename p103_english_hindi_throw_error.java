package jDemos1;

import java.util.InputMismatchException;
import java.util.Scanner;


class myerror1 extends Exception{

	public String toString()
	{
		return "error due to <0 in english";
	}
}

class myerror2 extends Exception{

	public String toString()
	{
		return "error due to <0 in hindi";
	}
}

public class p103_english_hindi_throw_error {

	public static void main(String[] args) 
	{
		try 
		{
			int eng,hindi;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nEnter marks of english : ");
			eng= sc.nextInt();
			
			System.out.print("\nEnter marks of hindi : ");
			hindi= sc.nextInt();
			
			if(eng<0)
			{
				throw new myerror1();
			}
			else if(hindi<0)
			{
				throw new myerror2();
			}
			else {
				System.out.println("Sum = " + (eng+hindi));
			}
			
			
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

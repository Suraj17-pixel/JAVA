package jDemos1;

import java.util.Scanner;

class MathOperations {
    int a;
    int b;
 

    void setdata() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter value of a => ");
			a = sc.nextInt();

			System.out.print("Enter value of b => ");
			b = sc.nextInt();
		}
    }

    void addition() 
    {
        System.out.println("add = "+( a + b));
    }

    void subtraction() 
    {
    	 System.out.println("sub = "+( a - b));
    }

    void multiplication() 
    {
    	 System.out.println("mul = "+( a * b));
    }

    void division() 
    {
    	 System.out.println("div = "+( a / b));
    }

    void printdata() 
    {
       System.out.println(" a =" + a + " b = " + b);
    }
}

public class p88_math_function {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        math.setdata();
        math.printdata();
        math.addition();
        math.subtraction();
        math.multiplication();
        math.division();
    }
}

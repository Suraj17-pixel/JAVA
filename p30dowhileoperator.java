package jDemos1;

import java.util.Scanner;

public class p30dowhileoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int num1, num2;
	        char choice;

	        do {
	            System.out.println("\n Press + for addition");
	            System.out.println(" Press - for subtraction");
	            System.out.println(" Press * for multiplication"); 
	            System.out.println(" Press / for division");
	            System.out.println(" Press 5 to Exit");
	            System.out.print(" Press = ");

	            choice = sc.next().charAt(0);

	            switch (choice) {
	                case '+':
	                    System.out.print("\n Enter num1 = ");
	                    num1 = sc.nextInt();
	                    
	                    System.out.print("\n Enter num2 = ");
	                    num2 = sc.nextInt();
	                    
	                    System.out.printf("\n Addition = %d", num1 + num2);
	                    break;
	                case '-':
	                    System.out.print("\n Enter num1 = ");
	                    num1 = sc.nextInt();
	                    
	                    System.out.print("\n Enter num2 = ");
	                    num2 = sc.nextInt();
	                    
	                    System.out.printf("\n Subtraction = %d", num1 - num2);
	                    break;
	                case '*':
	                    System.out.print("\n Enter num1 = ");
	                    num1 = sc.nextInt();
	                    
	                    System.out.print("\n Enter num2 = ");
	                    num2 = sc.nextInt();
	                    
	                    System.out.printf("\n Multiplication = %d", num1 * num2);
	                    break;
	                case '/':
	                    System.out.print("\n Enter num1 = ");
	                    num1 = sc.nextInt();
	                    
	                    System.out.print("\n Enter num2 = ");
	                    num2 = sc.nextInt();
	                    
	                    if (num2 != 0) {
	                        System.out.printf("\n Division = %d", num1 / num2);
	                    } else {
	                        System.out.println("\n Cannot divide by zero!");
	                    }
	                    break;
	                case '5':
	                    System.out.println("\n Exiting... Goodbye!");
	                    break;
	                default:
	                    System.out.println("\n Invalid input! Please enter a valid option.");
	                    break;
	            }

	        } while (choice != '5');

	        sc.close();
	        
	}

}

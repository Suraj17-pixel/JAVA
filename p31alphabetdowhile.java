package jDemos1;

import java.util.Scanner;

public class p31alphabetdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int num1, num2;
        char choice;

        do {
            System.out.println("\n Press A for addition");
            System.out.println(" Press S for subtraction");
            System.out.println(" Press M for multiplication"); 
            System.out.println(" Press D for division");
            System.out.println(" Press E to Exit");
            System.out.print(" Press = ");

            choice = sc.next().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.print("\n Enter num1 = ");
                    num1 = sc.nextInt();
                    
                    System.out.print("\n Enter num2 = ");
                    num2 = sc.nextInt();
                    
                    System.out.printf("\n Addition = %d", num1 + num2);
                    break;
                case 'S':
                    System.out.print("\n Enter num1 = ");
                    num1 = sc.nextInt();
                    
                    System.out.print("\n Enter num2 = ");
                    num2 = sc.nextInt();
                    
                    System.out.printf("\n Subtraction = %d", num1 - num2);
                    break;
                case 'M':
                    System.out.print("\n Enter num1 = ");
                    num1 = sc.nextInt();
                    
                    System.out.print("\n Enter num2 = ");
                    num2 = sc.nextInt();
                    
                    System.out.printf("\n Multiplication = %d", num1 * num2);
                    break;
                case 'D':
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
                case 'E':
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

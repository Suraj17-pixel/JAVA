package jDemos1;

import java.util.Scanner;

public class p32vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter alphabet: ");
        char alphabet = sc.next().charAt(0); 
        
        if (alphabet == 'a' || alphabet == 'A' || alphabet == 'e' || alphabet == 'E' ||
            alphabet == 'i' || alphabet == 'I' || alphabet == 'o' || alphabet == 'O' ||
            alphabet == 'u' || alphabet == 'U') {
            System.out.println("\nIt is a vowel");
        } else {
            System.out.println("\nIt is not a vowel");
        }
        
        sc.close();

	}

}

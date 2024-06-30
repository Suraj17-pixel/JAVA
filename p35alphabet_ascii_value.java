package jDemos1;

import java.util.Scanner;

public class p35alphabet_ascii_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       try (Scanner sc = new Scanner(System.in)) {
		System.out.print("\nEnter alphabet: ");
        char alphabet = sc.next().charAt(0); 
        
        int asciiValue = (int) alphabet;

        System.out.println("The ASCII value of '" + alphabet + "' is: " + asciiValue);
	}

	}

}

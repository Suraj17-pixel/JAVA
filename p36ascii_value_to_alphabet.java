package jDemos1;

import java.util.Scanner;

public class p36ascii_value_to_alphabet {

	    public static char asciiToAlphabet(int asciiValue) {
	        char alphabet = (char) asciiValue;
	        return alphabet;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the ASCII value : ");
	        int asciiValue = scanner.nextInt();

	        char alphabet = asciiToAlphabet(asciiValue);

	        System.out.println("The alphabet for ASCII value " + asciiValue + " is: " + alphabet);

	        scanner.close();
        
	}

}
package jDemos1;

import java.util.Scanner;

public class p34upper_converts_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch,ch2;
		
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("\nEnter any Character : ");
			ch = sc.next().charAt(0);
		}
        
        if(ch>='A' && ch<='Z')
        {
        	ch2=Character.toLowerCase(ch);
        	System.out.print("Lowercase = " + ch2);
        }
        else 
        {
        	ch2=Character.toUpperCase(ch);
        	System.out.print("Uppercase = " + ch2);
        }
        

	}

}
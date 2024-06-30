package jDemos1;

import java.util.Scanner;

public class p33aplphabetisupperorlower {

	static void check(char ch) 
    { 
		
try (Scanner sc = new Scanner(System.in)) {
	System.out.print("\nEnter alphabet: ");
	sc.next().charAt(0);
}
        
        if (ch >= 'A' && ch <= 'Z') 
            System.out.println("\n" + ch + 
                    " is an UpperCase character"); 
     
        else if (ch >= 'a' && ch <= 'z') 
            System.out.println("\n" + ch + 
                    " is an LowerCase character" ); 
     
        else
            System.out.println("\n" + ch + 
                    " is not an alphabetic character" ); 
    } 
 
    public static void main(String []args)
    { 
        char ch; 
     
        ch = 'J'; 
     

        check(ch); 
     
        ch = 'j'; 
      
        check(ch); 

        ch = '0'; 
 
        check(ch); 

    }
}

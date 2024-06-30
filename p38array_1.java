package jDemos1;

import java.util.Scanner;

public class p38array_1 {

    public static void main(String[] args) {
        
        int a[] = new int[100];
        int n, i;
        
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("\nEnter limit: ");
			n = sc.nextInt(); 

			for (i = 0; i < n; i++) { 
			    System.out.print("\nEnter number: ");
			    a[i] = sc.nextInt();
			}
			
			// Display numbers from the array
			System.out.println("\nNumbers entered:");
			for (i = 0; i < n; i++) {
			    System.out.println(a[i]);
			}
			
			sc.close();
		} 
    }
}

package jDemos1;

public class p41odd_even_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[] = {11, 5, 7, 20, 11, 55, 60, 11, 9, 14, 23, 21, 11, 6};
		        
		        System.out.println("Odd numbers:");
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] % 2 != 0) { 
		                System.out.print(a[i] + " ");
		            }
		        }
		        
		        System.out.println("\nEven numbers:");
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] % 2 == 0) { 
		                System.out.print(a[i] + " ");
		            }
		        }
		    }
	}

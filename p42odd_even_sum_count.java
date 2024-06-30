package jDemos1;

public class p42odd_even_sum_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int a[] = {11, 5, 7, 20, 11, 55, 60, 11, 9, 14, 23, 21, 11, 6};
		        int oddSum = 0;
		        int evenSum = 0;
		        
		        System.out.println("Odd numbers:");
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] % 2 != 0) { 
		                System.out.print(a[i] + " ");
		                oddSum += a[i]; 
		            }
		        }
		        System.out.println("\nSum of odd numbers: " + oddSum);
		        
		        System.out.println("\nEven numbers:");
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] % 2 == 0) {
		                System.out.print(a[i] + " ");
		                evenSum += a[i]; 
		            }
		        }
		        System.out.println("\nSum of even numbers: " + evenSum);
		    }
		}

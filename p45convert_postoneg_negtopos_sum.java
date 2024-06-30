package jDemos1;

public class p45convert_postoneg_negtopos_sum {

	public static void main(String[] args) {
		
		        int a[] = {11, -5, 7, 20, 11, 55, 60, -11, 9, -14, 23, -21, 11, -6};
		        int possum = 0;
		        int negsum = 0;
		        
		        System.out.println("Original Array:");
		        printArray(a);
	
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] > 0) {
		                a[i] = -a[i];
		            } else if (a[i] < 0) {
		                a[i] = -a[i]; 
		            }
		        }
		        
		        System.out.println("\nConverted Array:");
		        printArray(a);

		        for (int i = 0; i < a.length; i++) {
		            if (a[i] > 0) {
		                possum += a[i];
		            } else {
		                negsum += a[i];
		            }
		        }
		        
		        System.out.println("\nSum of positive converted numbers: " + possum);
		        System.out.println("Sum of negative converted numbers: " + negsum);
		    }

		    public static void printArray(int[] arr) {
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		    }
		}

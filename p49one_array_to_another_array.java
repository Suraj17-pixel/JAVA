package jDemos1;

public class p49one_array_to_another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] originalArray = {9,97,3,4,24,56};
	
		        int[] newArray = new int[originalArray.length];
		        
		    System.out.println("Elements in the original array: ");
		        for (int i = 0; i < originalArray.length; i++) {
		            newArray[i] = originalArray[i];
		            System.out.println(originalArray[i] + " ");
		        }
		       
		        System.out.println("Elements in the new array: ");
		        for (int i = 0; i < newArray.length; i++) {
		            System.out.print(newArray[i] + " ");
		        }

	}

}

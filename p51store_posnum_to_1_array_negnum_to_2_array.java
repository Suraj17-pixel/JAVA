package jDemos1;

public class p51store_posnum_to_1_array_negnum_to_2_array {

    public static void main(String[] args) {
        int[] originalArray = {11, 5, 7, 20, -11, -99, -60, 11, -9, -14, 23, -21, 11, -6};

        int[] positiveArray = new int[originalArray.length];
        int[] negativeArray = new int[originalArray.length];
        int positiveCount = 0; 
        int negativeCount = 0; 

        System.out.println("Elements in the original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] >= 0) 
            {
                positiveArray[positiveCount] = originalArray[i];
                positiveCount++;
            } 
            else 
            {
                negativeArray[negativeCount] = originalArray[i];
                negativeCount++;
            }
            
            System.out.print(originalArray[i] + " ");
        }
        
        System.out.println(); 
       
        System.out.println("Positive numbers in the positiveArray: ");
        for (int i = 0; i < positiveCount; i++) 
        {
            System.out.print(positiveArray[i] + " ");
        }
        System.out.println(); 
        
        System.out.println("Negative numbers in the negativeArray: ");
        for (int i = 0; i < negativeCount; i++) 
        {
            System.out.print(negativeArray[i] + " ");
        }
        System.out.println(); 
    }
}

package jDemos1;

public class p48second_maxnum_position {

    public static void main(String[] args) {

        int a[] = {11, 5, 7, 20, 11, 99, 60, 11, 9, 14, 23, 21, 11, 6}; 
        int max1 = 0;  
        int max2 = 0;
        int maxIndex1 = 0;
        int maxIndex2 = 0;
      
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) 
            {
                max2 = max1;  
                maxIndex2 = maxIndex1;
                max1 = a[i];  
                maxIndex1 = i;  
            } 
            
            else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];  
                maxIndex2 = i; 
            }
        }

        System.out.println("First highest number in the array is: " + max1);
        System.out.println("Position of first highest number = " + maxIndex1);
        
        System.out.println("Second highest number in the array is: " + max2);
        System.out.println("Position of second highest number = " + maxIndex2);
    }

}

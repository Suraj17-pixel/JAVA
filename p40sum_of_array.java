package jDemos1;

public class p40sum_of_array {

    public static void main(String[] args) {

        int a[] = {11, 5, 7, 20, 11, 55, 60, 11, 9, 14, 23, 21, 11, 6};
        int sum = 0; 

        
        for (int i = 0; i < a.length; i++) {
            sum += a[i]; 
        }

        
        System.out.println("Sum of elements in the array = " + sum);
    }
}
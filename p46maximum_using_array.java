package jDemos1;

public class p46maximum_using_array {

    public static void main(String[] args) {

        int a[] = {11, 5, 7, 20, 11, 55, 60, 11, 9, 14, 23, 21, 11, 6};
        int max = a[0]; 
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; 
            }
        }

        // Print the maximum number found
        System.out.println("Maximum number in the array is: " + max);
    }
}
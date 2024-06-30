package jDemos1;

public class p50store_square_from_one_array_another_array {

    public static void main(String[] args) {
        int[] originalArray = {11, 5, 7, 20, -11, -99, -60, 11, -9, -14, 23, -21, 11, -6}; 

        int[] newArray = new int[originalArray.length];

        System.out.println("Elements in the original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i] * originalArray[i]; // Compute square and store in newArray
            System.out.print(originalArray[i] + " ");
        }
        System.out.println(); // Move to new line after printing original array elements

        System.out.println("Elements (squares) in the new array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

}

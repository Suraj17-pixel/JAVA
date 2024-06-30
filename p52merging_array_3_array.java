package jDemos1;

public class p52merging_array_3_array {

    public static void main(String[] args) {
        int[] array1 = {11, 5, 7, 20, 11, 99, 60};
        int[] array2 = {11, 9, 14, 23, 21, 11, 6};

        
        int length1 = array1.length;
        int length2 = array2.length;
        int mergedLength = length1 + length2;
        
        int[] mergedArray = new int[mergedLength];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        System.out.print("Merged Array === ");
        for (int i = 0; i < mergedLength; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(mergedArray[i]);
        }
    }
}

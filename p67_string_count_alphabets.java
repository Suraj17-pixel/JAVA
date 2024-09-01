package jDemos1;

import java.util.Scanner;

public class p67_string_count_alphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your data: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] alphabetCount = countAlphabets(input);

        System.out.println("Alphabet count:");
        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + alphabetCount[i]);
            }
        }
    }

    private static int[] countAlphabets(String input) {
        int[] countArray = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                countArray[c - 'a']++;
            }
        }

        return countArray;
    }
}


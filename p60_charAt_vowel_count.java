package jDemos1;

public class p60_charAt_vowel_count {
    public static void main(String[] args) {
        String str = "Raja";
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            System.out.println(currentChar);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
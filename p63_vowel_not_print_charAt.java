package jDemos1;

public class p63_vowel_not_print_charAt {
    public static void main(String[] args) {
        String str = "Raja";
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                vowelCount++;
            } else {
                System.out.println(currentChar);
            }
        }

    }
}

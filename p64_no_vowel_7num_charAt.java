package jDemos1;

public class p64_no_vowel_7num_charAt {
    public static void main(String[] args) {
        String str = "Raja";
        StringBuilder modifiedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
                currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                modifiedStr.append('7');
            } else {
                modifiedStr.append(currentChar);
            }
        }

        System.out.println("Modified string: " + modifiedStr.toString());
    }
}

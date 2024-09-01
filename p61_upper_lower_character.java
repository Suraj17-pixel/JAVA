package jDemos1;

public class p61_upper_lower_character {
    public static void main(String[] args) {
        String str = "Raja";
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            System.out.println(currentChar);

            if (Character.isUpperCase(currentChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(currentChar)) {
                lowercaseCount++;
            }
        }

        System.out.println("Number of uppercase characters in the string: " + uppercaseCount);
        System.out.println("Number of lowercase characters in the string: " + lowercaseCount);
    }
}

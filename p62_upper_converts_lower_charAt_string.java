package jDemos1;

public class p62_upper_converts_lower_charAt_string {
    
	public static void main(String[] args) {
        String str = "Raja";
        StringBuilder convertedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                convertedStr.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                convertedStr.append(Character.toUpperCase(currentChar));
            } else {
                convertedStr.append(currentChar);
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("Converted string: " + convertedStr.toString());
    }
}

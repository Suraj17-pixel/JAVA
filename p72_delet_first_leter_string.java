package jDemos1;

public class p72_delet_first_leter_string {
    public static void main(String[] args) {
        String str = "jaimin suraj";
        
        // Find the index of the first space
        int spaceIndex = str.indexOf(' ');

        // If a space is found and there's at least one character after the space
        if (spaceIndex != -1 && spaceIndex < str.length() - 1) {
            // Create a new string with the character after the space removed
            String modifiedString = str.substring(0, spaceIndex + 1) + str.substring(spaceIndex + 2);
            System.out.println("Original string: " + str);
            System.out.println(" deleting the first letter : " + modifiedString);
        } else {
            // If no space is found or the space is at the end of the string
            System.out.println("No space found or space is at the end of the string");
        }
    }
}

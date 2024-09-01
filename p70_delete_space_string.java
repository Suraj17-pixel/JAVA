package jDemos1;

public class p70_delete_space_string {
    public static void main(String[] args) {
        String str = "jaimin                                                        suraj";
        
        
        String withoutSpaces = str.replaceAll("\\s", "");
        
        System.out.println("Original string: " + str);
        System.out.println("String without spaces: " + withoutSpaces);
    }
}
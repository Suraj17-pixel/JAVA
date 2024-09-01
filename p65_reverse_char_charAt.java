package jDemos1;

public class p65_reverse_char_charAt {
    public static void main(String[] args) {
        String str = "Raj";

   
        for (int i = str.length() -1; i >=0; i--) {
           
            char currentChar = str.charAt(i);
           
            System.out.println(currentChar);
        }
    }
}

package jDemos1;

public class p59_string_charAt {
    public static void main(String[] args) {
        String str = "Raja";

   
        for (int i = 0; i < str.length(); i++) {
           
            char currentChar = str.charAt(i);
           
            System.out.println(currentChar);
        }
    }
}

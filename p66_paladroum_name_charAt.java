package jDemos1;

public class p66_paladroum_name_charAt 
{
    public static boolean isPalindrome(String str) 
    {
        
    	String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    public static void main(String[] args) 
    {
        String input = "Jaimin";
        input = input.toLowerCase();
        
        boolean result = isPalindrome(input);
        System.out.println(result); 
    }
}

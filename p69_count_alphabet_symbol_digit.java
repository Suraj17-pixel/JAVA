package jDemos1;

import java.util.Scanner;

public class p69_count_alphabet_symbol_digit 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }

        countCharacters(password);

        scanner.close();
    }

    public static boolean isValidPassword(String password) 
    {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{10,}$";
        return password.matches(regex);
    }

    public static void countCharacters(String password) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (char ch : password.toCharArray()) 
        {
            if (Character.isUpperCase(ch)) 
            {
                upperCaseCount++;
            } 
            else if (Character.isLowerCase(ch)) 
            {
                lowerCaseCount++;
            } 
            else if (Character.isDigit(ch)) 
            {
                digitCount++;
            } 
            else if ("@#$%^&+=!".indexOf(ch) != -1) 
            {
                specialCharCount++;
            }
        }

        System.out.println("Uppercase letters: " + upperCaseCount);
        System.out.println("Lowercase letters: " + lowerCaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCharCount);
    }
}

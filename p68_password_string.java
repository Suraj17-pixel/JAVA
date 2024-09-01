package jDemos1;

import java.util.Scanner;

public class p68_password_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }

        
        scanner.close();
    }

    
    public static boolean isValidPassword(String password) {
       
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{10,}$";
        
        return password.matches(regex);
    }
}
package jDemos1;

import java.util.Scanner;

class MyError extends Exception
{

    public String toString() 
    {
        return "ERROR: The address must be at least 10 characters long.";
    }
}

public class p104_user_address_error
{

    public static void main(String[] args) 
    {
        try {
            String address;

            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter your Address: ");
            address = sc.nextLine();

            if (address.length() < 10) 
            {
                throw new MyError();
            } 
            
            else 
            {
                System.out.println("Address entered successfully: " + address);
            }

            sc.close();
            
        } catch (MyError e) 
        {
            System.out.println(e);
        } 
    }
}

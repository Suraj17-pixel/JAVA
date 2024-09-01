package jDemos1;

import java.util.Scanner;

class usa {
    int a;

    void setusa() 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: = ");
        a = scanner.nextInt();
    }

    void printusa() 
    {
        System.out.println("a = " + a);
    }
}

class India extends usa 
{
    int b;

    void setIndia() 
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of b: = ");
        b = scanner.nextInt();
    }

    void printIndia() 
    {
        System.out.println("b = " + b);
    }

    void multiplication() 
    {
        System.out.println("Multiply = " + (a * a));
    }
}

public class p90_inheritance_data {

    public static void main(String[] args) 
    {
   
        India i1 = new India();

        i1.setusa();
        i1.setIndia();

        i1.printusa();
        i1.printIndia();
        
        i1.multiplication();
    }
}

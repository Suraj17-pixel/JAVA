package jDemos1;

import java.util.Scanner;

class Bank {
    String acno;
    String cname;
    int balance;
    
    Scanner scanner = new Scanner(System.in);
    
    void openac() {
        System.out.print("Enter account number: ");
        acno = scanner.nextLine();
        
        System.out.print("Enter customer name: ");
        cname = scanner.nextLine();
        
        System.out.print("Enter balance: ");
        balance = scanner.nextInt();
     
    }

    void printac() {
        System.out.println("Account No: " + acno);
        System.out.println("Account Holder Name: " + cname);
        System.out.println("Balance: " + balance);
    }

    void deposit() {
    	int x;
        System.out.print("Enter deposit amount: ");
        x=scanner.nextInt();
        balance=balance+x;
    }

    void withdraw() {
    	int x;
        System.out.print("Enter withdrawal amount: ");
        x=scanner.nextInt();
        balance=balance-x;
    }
}

public class p89_bank_account_data {
    public static void main(String[] args) 
    {
        Bank b1 = new Bank();
        
        b1.openac();
        b1.printac();
        
        b1.deposit();
        b1.printac();
        
        b1.withdraw();
        b1.printac();
    }
}

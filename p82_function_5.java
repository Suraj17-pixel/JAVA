package jDemos1;

public class p82_function_5 {

	public void print() {
        System.out.println("Print with no parameters");
    }

    public void print(String message) {
        System.out.println("Message: " + message);
    }

    public void print(String message, int number) 
    {
        System.out.println("Message: " + message + ", Number: " + number);
    }

    public static void main(String[] args) {
        p82_function_5 obj = new p82_function_5();
        obj.print(); 
        obj.print("Hello!"); 
        obj.print("Hello!", 5); 
    }
}

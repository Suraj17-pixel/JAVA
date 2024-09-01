package jDemos1;

public class p80_function_3 {
    // Function that returns a value
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        p80_function_3 obj = new p80_function_3();
        int result = obj.add(5, 3); // Call the function and store the result
        System.out.println("The sum is: " + result);
    }
}

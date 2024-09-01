package jDemos1;

public class p77_string_buffer_5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial Capacity: " + sb.capacity()); 
        sb.append("Hello");
        System.out.println("Length: " + sb.length()); 
        System.out.println("Capacity: " + sb.capacity()); 
        sb.append(" World! This is a test for capacity.");
        System.out.println("Length: " + sb.length()); 
        System.out.println("Capacity: " + sb.capacity()); 
    }
}

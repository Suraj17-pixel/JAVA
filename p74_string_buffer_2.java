package jDemos1;

public class p74_string_buffer_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        sb.insert(6, "Beautiful ");
        System.out.println(sb); // Output: Hello Beautiful World!
    }
}

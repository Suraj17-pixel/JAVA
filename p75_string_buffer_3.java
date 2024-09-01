package jDemos1;

public class p75_string_buffer_3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        sb.delete(5, 12);
        System.out.println(sb); 
    }
}

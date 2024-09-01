package jDemos1;

import java.util.ArrayList;

public class p83_array_list {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Iterating over elements
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing elements
        fruits.remove("Banana");
        System.out.println("After removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Getting the size
        System.out.println("Size of the list: " + fruits.size()); // Output: 2

        // Checking if an element exists
        System.out.println("Contains Cherry: " + fruits.contains("Cherry")); // Output: true
        System.out.println("Contains Banana: " + fruits.contains("Banana")); // Output: false
    }
}

package jDemos1;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class p92_single_inheritence_example 
{
    public static void main(String[] args) 
    {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.bark(); 
    }
}
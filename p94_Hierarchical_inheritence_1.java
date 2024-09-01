package jDemos1;

// Base class
class Vehicles {
    void work() {
        System.out.println("This vehicles work.");
    }
}

// Derived class 1
class Car extends Vehicles  {
    void runs() {
        System.out.println("The car runs.");
    }
}

// Derived class 2
class Bike extends Vehicles {
    void speed() {
        System.out.println("The bike speeds.");
    }
}

public class p94_Hierarchical_inheritence_1 {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Car car = new Car();
        Bike bike = new Bike();
        
        // Calling methods from the base class
        car.work();
        bike.work();
        
        // Calling methods from the derived classes
        car.runs();
        bike.speed();
    }
}

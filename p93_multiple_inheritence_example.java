package  jDemos1;

interface Vehicle {
    void drive();
}

// Interface 2
interface Electric {
    void charge();
}

// Concrete class implementing multiple interfaces
class ElectricCar implements Vehicle, Electric {
    @Override
    public void drive() {
        System.out.println("Electric car is driving");
    }
    
    @Override
    public void charge() {
        System.out.println("Electric car is charging");
    }
}

public class p93_multiple_inheritence_example {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.drive();   // Method from Vehicle interface
        myCar.charge();  // Method from Electric interface
    }
}

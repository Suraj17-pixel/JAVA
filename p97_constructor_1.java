package jDemos1;

public class p97_constructor_1 {

    class Person {
        String name;
        int age;

        Person() {
            name = "Jaimin";
            age = 9999;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        p97_constructor_1 demo = new p97_constructor_1();
        Person person = demo.new Person();
        person.display();
    }
}

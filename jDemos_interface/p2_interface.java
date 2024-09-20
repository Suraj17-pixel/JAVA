package jDemos_interface;

interface Polygon {
    void calculateArea();
}

class Triangle implements Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class p2_interface {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);
        Rectangle rectangle = new Rectangle(4, 6);

        triangle.calculateArea(); 
        rectangle.calculateArea(); 
    }
}

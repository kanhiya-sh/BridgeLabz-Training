package Capgemini_Day12_class_object;

class Circle {
    private double radius; // Instance variable to hold radius

    Circle(double radius) {  // This is the Constructor to initialize radius
        this.radius = radius;
    }

    void calculate() { // This is the Method to calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
    }
}

public class ComputeAreaOfCircle {
    public static void main(String[] args) {
        Circle cir = new Circle(2.5); // Creating an object of Circle class with radius 2.5
        cir.calculate();
    }
}

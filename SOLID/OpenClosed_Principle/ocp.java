package OCP;


// Define the Shape interface. This will be our contract for all shapes.
interface Shape {
    double calculateArea();
}

// Implement the Shape interface with a Circle class.
class Circle implements Shape {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Implement the Shape interface with a Rectangle class.
class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor to initialize the width and height of the rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }
}

// Implement the Shape interface with a Square class.
class Square implements Shape {
    private double side;

    // Constructor to initialize the side length of the square
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}

// AreaCalculator class is responsible for calculating the area of multiple shapes.
class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

public class ocp {
    public static void main(String[] args) {
        // Create instances of shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(6);

        // Array of shapes
        Shape[] shapes = {circle, rectangle, square};

        // Create an instance of AreaCalculator
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate and print the total area of the shapes
        double totalArea = areaCalculator.calculateTotalArea(shapes);
        System.out.println("The total area of the shapes is " + totalArea);
    }
}

/*

 * In this code, the AreaCalculator class is closed for modification because 
 * i don’t need to change it if you want to add a new shape. 
 * i just need to create a new class that implements the Shape interface 
 * and the AreaCalculator class will be able to calculate its area. 
 * This is the essence of the Open-Closed Principle.

/*
Open-closed Principle (OCP) states:
--Objects or entities should be open for extension but closed for modification.
This means that a class should be extendable without modifying the class itself.
*/

/* */


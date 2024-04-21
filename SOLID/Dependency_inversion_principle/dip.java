package DIP;


// Define the Shape interface. This will be our abstraction for all shapes.
interface Shape {
    double calculateArea();
}

// Implement the Shape interface with a Circle class.
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Implement the Shape interface with a Rectangle class.
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

// Implement the Shape interface with a Square class.
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }
}

// AreaCalculator class depends on the Shape abstraction, not on the concrete classes.
class AreaCalculator {
    private Shape shape;

    // Constructor injection
    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public double calculate() {
        return shape.calculateArea();
    }
}

public class dip {
    public static void main(String[] args) {
        // Use Circle
        Shape circle = new Circle(5);
        AreaCalculator circleAreaCalculator = new AreaCalculator(circle);
        System.out.println("The area of the circle is " + circleAreaCalculator.calculate());

        // Use Rectangle
        Shape rectangle = new Rectangle(4, 5);
        AreaCalculator rectangleAreaCalculator = new AreaCalculator(rectangle);
        System.out.println("The area of the rectangle is " + rectangleAreaCalculator.calculate());

        // Use Square
        Shape square = new Square(6);
        AreaCalculator squareAreaCalculator = new AreaCalculator(square);
        System.out.println("The area of the square is " + squareAreaCalculator.calculate());
    }
}

/*
 * 
 * Dependency inversion principle states:
 * Entities must depend on abstractions, not on concretions. 
 * It states that the high-level module must not depend on the 
 * low-level module, but they should depend on abstractions.
 * 
 */

 /*

 In this code, the AreaCalculator class depends on the Shape interface (an abstraction), 
 not on the Circle, Rectangle, or Square classes (the details). 
 This means you can add a new shape by creating a new class 
 that implements the Shape interface, without having to modify 
 the AreaCalculator class. This is the essence of the Dependency 
 Inversion Principle.

  */

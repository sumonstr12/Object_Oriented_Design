/**
 * Dependency Inversion Principle
 * @author Sumon Chandra Barman
 */

package DIP;

/**
 * Shape interface.
 * This will be our abstraction for all shapes.
 */
interface Shape {
    /**
     * Calculate the area of the shape.
     * @return the area of the shape.
     */
    double calculateArea();
}

/**
 * Circle class.
 * Implements the Shape interface.
 */
class Circle implements Shape {
    private double radius;

    /**
     * Circle constructor.
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculate the area of the circle.
     * @return the area of the circle.
     */
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

/**
 * Rectangle class.
 * Implements the Shape interface.
 */
class Rectangle implements Shape {
    private double width;
    private double height;

    /**
     * Rectangle constructor.
     * @param width ,height  The width,height of the Rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculate the area of the Rectangle.
     * @return the area of the Rectangle.
     */
    public double calculateArea() {
        return width * height;
    }
}

/**
 * Square class.
 * Implements the Shape interface.
 */
class Square implements Shape {
    private double side;

    /**
     * Square constructor.
     * @param side one side of the Square.
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculate the area of the Square.
     * @return the area of the Square.
     */
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}

/**
 * AreaCalculator class.
 * Depends on the Shape abstraction, not on the concrete classes.
 */
class AreaCalculator {
    private Shape shape;

    /**
     * AreaCalculator constructor.
     * @param shape The shape to calculate the area for.
     */
    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    /**
     * Calculate the area of the shape.
     * @return the area of the shape.
     */
    public double calculate() {
        return shape.calculateArea();
    }
}

/**
 * Main class.
 */
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

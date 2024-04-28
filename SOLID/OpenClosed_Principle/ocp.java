package OCP;
import java.util.Scanner;
 
/**
*
* @author Sumon Chandra Barman.
*/

/**
 * Shape interface.
 * This will be our contract for all shapes.
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
     * @param height and width is height and width of the Rectangle.
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
     * @param side is one side of the square.
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculate the area of the square.
     * @return the area of the square.
     */
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}

/**
 * AreaCalculator class.
 * Responsible for calculating the area of multiple shapes.
 */
class AreaCalculator {
    /**
     * Calculate the total area of the given shapes.
     * @param shapes An array of shapes.
     * @return the total area of the shapes.
     */
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

/**
 * Main class.
 */
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
Open-closed Principle (OCP) states:
--Objects or entities should be open for extension but closed for modification.
This means that a class should be extendable without modifying the class itself.
*/

/**
 * In this code, the AreaCalculator class is closed for modification because 
 * i don’t need to change it if you want to add a new shape. 
 * i just need to create a new class that implements the Shape interface 
 * and the AreaCalculator class will be able to calculate its area. 
 * This is the essence of the Open-Closed Principle.


/* */


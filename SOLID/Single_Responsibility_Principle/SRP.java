package srp;    // Package for this code classes

import java.util.Scanner;

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
     * @param width,height  of the rectangle.
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
     * @param side of the Square.
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculate the area of the Rectangle.
     * @return the area of the Rectangle.
     */
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}

/**
 * Main function to calculate Area.
 */
public class SRP{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of shape (circle, rectangle, square):");
        String shapeType = scanner.nextLine();

        Shape shape = null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case "rectangle":
                System.out.println("Enter the width of the rectangle:");
                double width = scanner.nextDouble();
                System.out.println("Enter the height of the rectangle:");
                double height = scanner.nextDouble();
                shape = new Rectangle(width, height);
                break;
            case "square":
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;
            default:
                System.out.println("Invalid shape type.");
                System.exit(0);
        }

        System.out.println("The area of the " + shapeType + " is " + shape.calculateArea());
    }
}

/**
 *
 * this code is based on single responsibility principle
 * In SRP,there have A class should have only one responsibility.
 * When we design our classes, we should take care that one 
class at the most is responsible for doing one task.
 * so,here i implement SRP in "Circle" & "Square" class.
 * Both class are responsible for doing one task that is they calculated
 * area of the circle and tha square.
 * 
 * 
 */


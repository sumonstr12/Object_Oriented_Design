/**
 * Interface segression Principle
 * @author Sumon chandra Barman
 */

package ISP;

/**
 * Interface for calculating area.
 */
interface AreaCalculator {
    /**
     * Calculate the area.
     * @return the area.
     */
    double calculateArea();
}

/**
 * Interface for calculating perimeter.
 */
interface PerimeterCalculator {
    /**
     * Calculate the perimeter.
     * @return the perimeter.
     */
    double calculatePerimeter();
}

/**
 * Circle class.
 * Implements the AreaCalculator and PerimeterCalculator interfaces.
 */
class Circle implements AreaCalculator, PerimeterCalculator {
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

    /**
     * Calculate the perimeter of the circle.
     * @return the perimeter of the circle.
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Rectangle class.
 * Implements the AreaCalculator and PerimeterCalculator interfaces.
 */
class Rectangle implements AreaCalculator, PerimeterCalculator {
    private double width;
    private double height;

    /**
     * Rectangle constructor.
     * @param width,height is The width and height of the rectangle.
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

    /**
     * Calculate the perimeter of the Rectangle.
     * @return the perimeter of the Rectangle.
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

/**
 * Square class.
 * Implements the AreaCalculator and PerimeterCalculator interfaces.
 */
class Square implements AreaCalculator, PerimeterCalculator {
    private double side;
    /**
     * Square constructor.
     * @param side is The one side of the square.
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

    /**
     * Calculate the perimeter of the square.
     * @return the perimeter of the square.
     */
    public double calculatePerimeter() {
        return 4 * side;
    }
}

/**
 * Main class.
 */
public class lsp {
    public static void main(String[] args) {
        // Create instances of shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(6);

        // Calculate and print the area and perimeter of the shapes
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}


/*
 * 
 * The interface segregation principle states:
 * A client should never be forced to implement
 * an interface that it doesn’t use, 
 * or clients shouldn’t be forced to depend on methods they do not use.
 * 
 * 
 */

 /*
  In this code, we have two interfaces: 
  AreaCalculator and PerimeterCalculator.
   The Circle, Rectangle, and Square classes implement both interfaces 
   because they can calculate both area and perimeter. 
   This way, if you have a shape that can only calculate area 
   but not perimeter, it can just implement the AreaCalculator interface 
   and not the PerimeterCalculator interface. 
   This is the essence of the Interface Segregation Principle.
  */

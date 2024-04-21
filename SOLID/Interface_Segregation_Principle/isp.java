package ISP;


// Define the interfaces
interface AreaCalculator {
    double calculateArea();
}

interface PerimeterCalculator {
    double calculatePerimeter();
}

// Circle class
class Circle implements AreaCalculator, PerimeterCalculator {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle implements AreaCalculator, PerimeterCalculator {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Square class
class Square implements AreaCalculator, PerimeterCalculator {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return 4 * side;
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
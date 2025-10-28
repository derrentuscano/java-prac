import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract double calculateArea(); // abstract method
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class ShapeHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Circle object
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);

        // Create Rectangle object
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        Shape rectangle = new Rectangle(length, width);

        // Store shapes in an array
        Shape[] shapes = { circle, rectangle };

        // Display area of each shape
        System.out.println("\n=== Areas of Shapes ===");
        for (Shape s : shapes) {
            System.out.println("Area: " + s.calculateArea());
        }

        sc.close();
    }
}


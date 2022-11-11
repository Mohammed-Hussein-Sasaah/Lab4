/*1. Write a PerimeterTester program that constructs a Rectangle object and then
computes and prints its perimeter. Use the getWidth and getHeight methods.
Also print the expected answer.*/

import java.awt.Rectangle;

public class PerimeterTester {
    public static void main (String [] args) {
        Rectangle rectangle = new Rectangle(15,30);

        double perimeter = 2*(rectangle.getHeight()) + 2*(rectangle.getWidth());
        System.out.printf("Perimeter: %.1f\n", perimeter);
        System.out.println("Expected: 90.0 ");
    }
}
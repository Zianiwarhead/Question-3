package triangle;

import java.util.Scanner;

public class Triangle {

    private double base;
    private double height;
    private double area;

    public void enterDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }

    public void computeArea() {
        area = 0.5 * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.enterDimensions();
        triangle.computeArea();
        triangle.displayArea();
    }
}

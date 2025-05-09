/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Shape Calculator Menu ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("7. Exit");
            System.out.print("Select a shape: ");
            int choice = scanner.nextInt();

            Shape selectedShape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double circleRadius = scanner.nextDouble();
                    selectedShape = new Circle(circleRadius);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double rectangleLength = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double rectangleWidth = scanner.nextDouble();
                    selectedShape = new Rectangle(rectangleLength, rectangleWidth);
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    double squareSide = scanner.nextDouble();
                    selectedShape = new Square(squareSide);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double sphereRadius = scanner.nextDouble();
                    selectedShape = new Sphere(sphereRadius);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double cylinderHeight = scanner.nextDouble();
                    selectedShape = new Cylinder(cylinderRadius, cylinderHeight);
                    break;
                case 6:
                    System.out.print("Enter base length: ");
                    double pyramidBase = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double pyramidHeight = scanner.nextDouble();
                    selectedShape = new EquilateralPyramid(pyramidBase, pyramidHeight);
                    break;
                case 7:
                    System.out.println("Exiting Shape Calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            // Display results
            System.out.println("\n--- Results ---");
            System.out.println("Shape: " + selectedShape.getShapeName());
            System.out.printf("Area: %.2f\n", selectedShape.calculateArea());
            System.out.printf("Perimeter: %.2f\n", selectedShape.calculatePerimeter());
            if (selectedShape instanceof Volume) {
                System.out.printf("Volume: %.2f\n", ((Volume) selectedShape).calculateVolume());
            } else {
                System.out.println("Volume: Not applicable for this shape.");
            }
        }
    }
}


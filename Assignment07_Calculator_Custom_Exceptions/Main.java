/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int menuChoice;
        double firstOperand, secondOperand;

        while (true) {
            // Display calculator menu
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            menuChoice = inputScanner.nextInt();

            try {
                switch (menuChoice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        firstOperand = inputScanner.nextDouble();
                        secondOperand = inputScanner.nextDouble();
                        Addition.performAddition(firstOperand, secondOperand);
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        firstOperand = inputScanner.nextDouble();
                        secondOperand = inputScanner.nextDouble();
                        Subtraction.performSubtraction(firstOperand, secondOperand);
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        firstOperand = inputScanner.nextDouble();
                        secondOperand = inputScanner.nextDouble();
                        Multiplication.performMultiplication(firstOperand, secondOperand);
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        firstOperand = inputScanner.nextDouble();
                        secondOperand = inputScanner.nextDouble();
                        Division.performDivision(firstOperand, secondOperand);
                        break;
                    case 5:
                        System.out.print("Enter a number: ");
                        firstOperand = inputScanner.nextDouble();
                        Square.performSquare(firstOperand);
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        firstOperand = inputScanner.nextDouble();
                        Cube.performCube(firstOperand);
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        firstOperand = inputScanner.nextDouble();
                        SquareRoot.performSquareRoot(firstOperand);
                        break;
                    case 8:
                        System.out.println("Exiting... Thank you!");
                        inputScanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Error: " + arithmeticException.getMessage());
            } catch (Exception exception) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                inputScanner.nextLine(); // clear invalid input
            }
        }
    }
}


# Java Calculator Application

This repository contains a Java-based calculator application that performs different operations based on user input. The application supports:

1. **Arithmetic Operations**: Performs addition, subtraction, multiplication, or division between two numbers.
2. **Fibonacci Sequence**: Generates the Fibonacci sequence for a specified number of terms.
3. **Array Statistics**: Calculates the mode and mean of an array of integers provided by the user.

## Files

- **Main.java**

  - Contains the `main` method.
  - Calls methods from `UserInput.java` to get user inputs.
  - Based on the selected operation, calls corresponding methods in `Calculator.java` and prints the result.
- **UserInput.java**

  - Handles all user interactions.
  - Displays a menu with three options:
    1. Arithmetic Operations (+, -, *, /)
    2. Fibonacci Sequence
    3. Array Statistics (Mode, Mean)
  - Contains helper methods to collect the necessary inputs.
- **Calculator.java**

  - Implements the functionality for the calculator:
    - **Arithmetic Operations**: `performArithmetic(double a, double b, char operator)`
    - **Fibonacci Sequence**: `generateFibonacci(int n)`
    - **Array Statistics**:
      - `calculateMode(int[] arr)` to compute the mode.
      - `calculateMean(int[] arr)` to compute the mean.

## How to Run

1. **Compile the Java files:**

   ```
   javac Main.java UserInput.java Calculator.java
   ```
2. **Run the Application:**

   ```bash
   java Main
   ```
3. **Follow the on-screen instructions** to choose an operation and provide the required inputs.

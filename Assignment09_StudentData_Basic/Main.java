/*
 * Name: Your Name
 * PRN: Your PRN
 * Batch: Your Batch
 */

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner inputScanner = new Scanner(System.in);
        int menuChoice;

        while (true) {
            // Display menu
            System.out.println("\n=== Student Data Entry Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Students by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                menuChoice = Integer.parseInt(inputScanner.nextLine());
                switch (menuChoice) {
                    case 1:
                        addStudentFlow(studentManager, inputScanner);
                        break;
                    case 2:
                        studentManager.displayAllStudents();
                        break;
                    case 3:
                        System.out.print("Enter PRN to search: ");
                        String searchPrn = inputScanner.nextLine();
                        Student foundByPrn = studentManager.findStudentByPrn(searchPrn);
                        foundByPrn.displayStudentInfo();
                        break;
                    case 4:
                        System.out.print("Enter Name to search: ");
                        String searchName = inputScanner.nextLine();
                        List<Student> foundByName = studentManager.findStudentsByName(searchName);
                        for (Student student : foundByName) {
                            student.displayStudentInfo();
                        }
                        break;
                    case 5:
                        System.out.print("Enter index position to search: ");
                        int index = Integer.parseInt(inputScanner.nextLine());
                        Student foundByIndex = studentManager.findStudentByIndex(index);
                        foundByIndex.displayStudentInfo();
                        break;
                    case 6:
                        updateStudentFlow(studentManager, inputScanner);
                        break;
                    case 7:
                        System.out.print("Enter PRN to delete: ");
                        String deletePrn = inputScanner.nextLine();
                        studentManager.deleteStudentByPrn(deletePrn);
                        System.out.println("Student deleted successfully.");
                        break;
                    case 8:
                        System.out.println("Exiting... Thank you!");
                        inputScanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (CustomStudentDataException | InputMismatchException | NumberFormatException exception) {
                System.out.println("Error: " + exception.getMessage());
            } catch (Exception exception) {
                System.out.println("Unexpected error: " + exception.getMessage());
            }
        }
    }

    // Helper method to add a student
    private static void addStudentFlow(StudentManager studentManager, Scanner scanner) throws CustomStudentDataException {
        System.out.print("Enter PRN: ");
        String prn = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter Marks: ");
        int marks = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(prn, name, dateOfBirth, marks);
        studentManager.addStudent(newStudent);
        System.out.println("Student added successfully.");
    }

    // Helper method to update a student
    private static void updateStudentFlow(StudentManager studentManager, Scanner scanner) throws CustomStudentDataException {
        System.out.print("Enter PRN to update: ");
        String prn = scanner.nextLine();
        System.out.print("Enter new Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new Date of Birth (dd-mm-yyyy): ");
        String newDob = scanner.nextLine();
        System.out.print("Enter new Marks: ");
        int newMarks = Integer.parseInt(scanner.nextLine());
        studentManager.updateStudent(prn, newName, newDob, newMarks);
        System.out.println("Student updated successfully.");
    }
}


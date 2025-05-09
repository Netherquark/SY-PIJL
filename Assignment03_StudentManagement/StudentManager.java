import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManager {
    private final ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter PRN: ");
        int prn = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Batch: ");
        String batch = scanner.nextLine();
        studentList.add(new Student(name, prn, department, cgpa, batch));
        System.out.println("Student added successfully.");
    }

    public void editStudent(Scanner scanner) {
        System.out.print("Enter PRN of student to edit: ");
        int prn = Integer.parseInt(scanner.nextLine());
        for (Student student : studentList) {
            if (student.getPrn() == prn) {
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new Department: ");
                student.setDepartment(scanner.nextLine());
                System.out.print("Enter new CGPA: ");
                student.setCgpa(Double.parseDouble(scanner.nextLine()));
                System.out.print("Enter new Batch: ");
                student.setBatch(scanner.nextLine());
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Enter PRN of student to delete: ");
        int prn = Integer.parseInt(scanner.nextLine());
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPrn() == prn) {
                iterator.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void searchStudent(Scanner scanner) {
        System.out.print("Enter PRN of student to search: ");
        int prn = Integer.parseInt(scanner.nextLine());
        for (Student student : studentList) {
            if (student.getPrn() == prn) {
                student.display();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : studentList) {
            student.display();
        }
    }
}


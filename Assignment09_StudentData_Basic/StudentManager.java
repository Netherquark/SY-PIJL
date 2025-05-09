import java.util.ArrayList;
import java.util.List;

/**
 * Manages student records and provides CRUD operations with custom exception handling.
 */
public class StudentManager {
    private final List<Student> studentList = new ArrayList<>();

    // Adds a student, checking for duplicate PRN
    public void addStudent(Student student) throws DuplicatePRNException {
        for (Student existingStudent : studentList) {
            if (existingStudent.getPrn().equals(student.getPrn())) {
                throw new DuplicatePRNException("PRN already exists: " + student.getPrn());
            }
        }
        studentList.add(student);
    }

    // Displays all students
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }

    // Finds a student by PRN
    public Student findStudentByPrn(String prn) throws StudentNotFoundException {
        for (Student student : studentList) {
            if (student.getPrn().equals(prn)) {
                return student;
            }
        }
        throw new StudentNotFoundException("No student found with PRN: " + prn);
    }

    // Finds students by name (case-insensitive)
    public List<Student> findStudentsByName(String name) throws InvalidNameException {
        if (name == null || name.length() < 2) {
            throw new InvalidNameException("Name must be at least 2 characters.");
        }
        List<Student> matchedStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                matchedStudents.add(student);
            }
        }
        if (matchedStudents.isEmpty()) {
            throw new InvalidNameException("No student found with name: " + name);
        }
        return matchedStudents;
    }

    // Finds a student by index position
    public Student findStudentByIndex(int index) throws IndexOutOfBoundsException {
        return studentList.get(index);
    }

    // Updates a student's details
    public void updateStudent(String prn, String newName, String newDob, int newMarks)
            throws StudentNotFoundException, InvalidNameException {
        Student studentToUpdate = findStudentByPrn(prn);
        studentToUpdate.setName(newName);
        studentToUpdate.setDateOfBirth(newDob);
        studentToUpdate.setMarks(newMarks);
    }

    // Deletes a student by PRN
    public void deleteStudentByPrn(String prn) throws StudentNotFoundException {
        Student studentToDelete = findStudentByPrn(prn);
        studentList.remove(studentToDelete);
    }
}


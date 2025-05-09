/**
 * Thrown when a student is not found by PRN.
 */
public class StudentNotFoundException extends CustomStudentDataException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}


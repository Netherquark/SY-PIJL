import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages CRUD operations for students in the MySQL database.
 */
public class StudentManager {

    public void addStudent(Student student) throws SQLException, DuplicatePRNException, InvalidPRNException {
        if (student.getPrn().length() != 3) {
            throw new InvalidPRNException("PRN must be exactly 3 characters.");
        }
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement checkStmt = connection.prepareStatement("SELECT * FROM students WHERE prn = ?");
            checkStmt.setString(1, student.getPrn());
            ResultSet resultSet = checkStmt.executeQuery();
            if (resultSet.next()) {
                throw new DuplicatePRNException("PRN already exists: " + student.getPrn());
            }
            PreparedStatement insertStmt = connection.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?)");
            insertStmt.setString(1, student.getPrn());
            insertStmt.setString(2, student.getName());
            insertStmt.setString(3, student.getDateOfBirth());
            insertStmt.setInt(4, student.getMarks());
            insertStmt.executeUpdate();
        }
    }

    public void displayAllStudents() throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
            boolean found = false;
            while (resultSet.next()) {
                found = true;
                System.out.printf("PRN: %s, Name: %s, DoB: %s, Marks: %d%n",
                        resultSet.getString("prn"),
                        resultSet.getString("name"),
                        resultSet.getString("dob"),
                        resultSet.getInt("marks"));
            }
            if (!found) {
                System.out.println("No students found in the database.");
            }
        }
    }

    public Student findStudentByPrn(String prn) throws SQLException, StudentNotFoundException {
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM students WHERE prn = ?");
            stmt.setString(1, prn);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return new Student(
                        resultSet.getString("prn"),
                        resultSet.getString("name"),
                        resultSet.getString("dob"),
                        resultSet.getInt("marks"));
            } else {
                throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
            }
        }
    }

    public List<Student> findStudentsByName(String name) throws SQLException, InvalidNameException {
        if (name.length() < 2) {
            throw new InvalidNameException("Name must be at least 2 characters.");
        }
        List<Student> students = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM students WHERE name = ?");
            stmt.setString(1, name);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getString("prn"),
                        resultSet.getString("name"),
                        resultSet.getString("dob"),
                        resultSet.getInt("marks")));
            }
        }
        if (students.isEmpty()) {
            throw new InvalidNameException("No student found with name: " + name);
        }
        return students;
    }

    public Student findStudentByIndex(int index) throws SQLException, IndexOutOfBoundsException {
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
            if (resultSet.absolute(index + 1)) {
                return new Student(
                        resultSet.getString("prn"),
                        resultSet.getString("name"),
                        resultSet.getString("dob"),
                        resultSet.getInt("marks"));
            } else {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
        }
    }

    public void updateStudent(String prn, String newName, String newDob, int newMarks)
            throws SQLException, StudentNotFoundException, InvalidNameException {
        if (newName.length() < 2) {
            throw new InvalidNameException("Name must be at least 2 characters.");
        }
        findStudentByPrn(prn); // Throws if not found
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE students SET name = ?, dob = ?, marks = ? WHERE prn = ?");
            stmt.setString(1, newName);
            stmt.setString(2, newDob);
            stmt.setInt(3, newMarks);
            stmt.setString(4, prn);
            stmt.executeUpdate();
        }
    }

    public void deleteStudentByPrn(String prn) throws SQLException, StudentNotFoundException {
        findStudentByPrn(prn); // Throws if not found
        try (Connection connection = DatabaseConnection.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM students WHERE prn = ?");
            stmt.setString(1, prn);
            stmt.executeUpdate();
        }
    }
}


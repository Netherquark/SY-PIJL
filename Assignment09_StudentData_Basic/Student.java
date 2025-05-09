/**
 * Represents a student with PRN, name, date of birth, and marks.
 */
public class Student {
    private final String prn;
    private String name;
    private String dateOfBirth;
    private int marks;

    public Student(String prn, String name, String dateOfBirth, int marks) throws InvalidPRNException, InvalidNameException {
        if (prn == null || prn.length() != 3) {
            throw new InvalidPRNException("PRN must be exactly 3 characters.");
        }
        if (name == null || name.length() < 2) {
            throw new InvalidNameException("Name must be at least 2 characters.");
        }
        this.prn = prn;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.marks = marks;
    }

    // Getters
    public String getPrn() { return prn; }
    public String getName() { return name; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getMarks() { return marks; }

    // Setters
    public void setName(String name) throws InvalidNameException {
        if (name == null || name.length() < 2) {
            throw new InvalidNameException("Name must be at least 2 characters.");
        }
        this.name = name;
    }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setMarks(int marks) { this.marks = marks; }

    // Display student details
    public void displayStudentInfo() {
        System.out.printf("PRN: %s, Name: %s, DoB: %s, Marks: %d%n", prn, name, dateOfBirth, marks);
    }
}


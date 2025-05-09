public class Student {
    private String name;
    private int prn;
    private String department;
    private double cgpa;
    private String batch;

    public Student(String name, int prn, String department, double cgpa, String batch) {
        this.name = name;
        this.prn = prn;
        this.department = department;
        this.cgpa = cgpa;
        this.batch = batch;
    }

    public int getPrn() { return prn; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
    public void setBatch(String batch) { this.batch = batch; }

    public void display() {
        System.out.printf("Name: %s | PRN: %d | Dept: %s | CGPA: %.2f | Batch: %s%n",
            name, prn, department, cgpa, batch);
    }
}


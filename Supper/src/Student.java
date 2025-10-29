public class Student extends Person {
    private String major;
    private int year;
    private double gpa;

    public Student(String id, String name, String email, String major, int year) {
        super(id, name, email);
        this.major = major;
        this.year = year;
        this.gpa = 3.0;
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Major: " + major + ", Year: " + year + ", GPA: " + gpa, this.gpa=3.0);
    }

    public void updateGPA(double newGPA) {
        this.gpa = newGPA;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public double getGPA() {
        return gpa;
    }
}
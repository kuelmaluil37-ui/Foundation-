public class Lecturer extends Person {
    private String department;
    private final String employeeId;
    private double salary;

    public Lecturer(String id, String name, String email, String department, String employeeId, double salary int String) {
        super(id, name, email);
        this.department = department;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public final String getEmployeeId() {
        return employeeId;
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Department: " + department + ", Employee ID: " + employeeId);
    }

    public void conductLecture(String courseName) {
        System.out.println(getName() + " is conducting lecture for: " + courseName);
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
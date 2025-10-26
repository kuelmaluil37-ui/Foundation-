
public class Student extends University {
     String major;
     int year;

    public Student(String name, String id, String major, int year) {
        super(name, id);
        this.major = major;
        this.year = year;
    }

    @Override
    public void performAction() {
        System.out.println("Student action: " + name + " is studying " + major + " in year " + year);
    }

    public void attendClass() {
        System.out.println(name + " is attending classes for " + major);
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }
}
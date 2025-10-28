public class Administration extends Person {
    private String position;
    private final String officeNumber;

    public Administration(String id, String name, String email, String position, String officeNumber) {
        super(id, name, email);
        this.position = position;
        this.officeNumber = officeNumber;
    }

    public final String getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public void displayBasicInfo() {
        super.displayBasicInfo();
        System.out.println("Position: " + position + ", Office: " + officeNumber);
    }

    public void processEnrollment(Student student, Course course) {
        System.out.println(getName() + " processed enrollment for " + student.getName() +
                " in course " + course.getCourseName());
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
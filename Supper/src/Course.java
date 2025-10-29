public class Course {
    private final String courseCode;
    private final String courseName;
    private Lecturer instructor;
    private int credits;

    public Course(String courseCode, String courseName, int credits string) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public final String getCourseCode() {
        return courseCode;
    }

    public final String getCourseName() {
        return courseName;
    }

    public void assignInstructor(Lecturer instructor) {
        this.instructor = instructor;
        System.out.println("Instructor " + instructor.getName() + " assigned to course " + courseName);
    }

    public void displayCourseInfo(string) {
        System.out.println("Course: " + courseCode + " - " + courseName + " (" + credits + " credits)");
        if (instructor != null) {
            System.out.println("Instructor: " + instructor.getName());
        }
    }

    public Lecturer getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }
}
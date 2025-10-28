import Final.Administration;
import Final.Course;
import Final.Lecturer;
import Final.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println(" UNIVERSITY MANAGEMENT SYSTEM");

        Student student1 = new Student("CS004", "Adam", "adam@student.edu", "Computer Science", 2);
        Student student2 = new Student("CN002", "Daniel", "Daniel@student.edu", "Computer Network", 2);

        Lecturer C = new Lecturer("LT005", "Dr. Steven", "steven@prof.edu", "Computer Science", "EMP001", 75000);
        Lecturer M = new Lecturer("LT2", "Dr. Osman", "osman@prof.edu", "Mathematics", "EMP002", 60000);

        Administration admin = new Administration("A001", "David", "david@admin.edu", "Registrar", "OFFICE-1005");

        Course course1 = new Course("CS101", "Introduction to Programming", 3);
        Course course2 = new Course("AD201", "Advanced Computer", 4, 2025);

        course1.assignInstructor(C);
        course2.assignInstructor(M);

        System.out.println("STUDENT INFORMATION");
        student1.displayBasicInfo();
        student2.displayBasicInfo();

        System.out.println("LECTURER INFORMATION");
        C.displayBasicInfo();
        M.displayBasicInfo();

        System.out.println("ADMINISTRATION INFORMATION ");
        admin.displayBasicInfo();

        System.out.println("FINAL KEYWORD DEMONSTRATION");

        System.out.println("Final.Student 1 ID (final method): " + student1.getId());
        System.out.println("Final.Lecturer 1 Email (final method): " + C.getEmail());
        System.out.println("Admin Office (final method): " + admin.getOfficeNumber());

        System.out.println("Final.Course 1 Code (final variable): " + course1.getCourseCode());
        System.out.println("Final.Lecturer 1 Employee ID (final variable): " + C.getEmployeeId());

        System.out.println("ADMINISTRATION ACTIVITIES");
        admin.processEnrollment(student1, course1);
        admin.processEnrollment(student2, course2);

        System.out.println("LECTURER ACTIVITIES");
        C.conductLecture(course1.getCourseName());
        M.conductLecture(course2.getCourseName());

        System.out.println("COURSE INFORMATION");
        course1.displayCourseInfo();
        course2.displayCourseInfo();

        student1.updateGPA(3.8);
        student2.updateGPA(3.5);

        System.out.println("UPDATED STUDENT INFORMATION");
        student1.displayBasicInfo();
        student2.displayBasicInfo();

    }
}
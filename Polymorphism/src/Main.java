public class Main {
    public static void demonstrateAction(University entity) {
        System.out.print("Entity type: " + entity.getClass().getSimpleName() + " -> ");
        entity.performAction();
        this.getClass()

        if (entity instanceof University) {
            System.out.println("This is an Administration staff member");
        } else if (entity instanceof University) {
            System.out.println("This is a Professor");
        } else if (entity instanceof Student) {
            System.out.println("This is a Student");
        } else {
            System.out.println("This is a general University entity");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating Inheritance & Polymorphism\n");

        Administration Admin = new Administration ("Johnson", "ADM001", "HR", "Manager");
        Professor professor = new Professor("Dr.Johnson", "PROF003", "Computer Science");
        Student student = new Student("James", "STU005", "Engineering", 3);

        Admin.performAction();
        professor.performAction();
        student.performAction();

        System.out.println("METHOD OVERLOADING DEMONSTRATION ===");
        Admin.displayDetails();
        Admin.displayDetails("Administration Staff Details");

        professor.displayDetails();
        professor.displayDetails("Professor Information");

        student.displayDetails();
        student.displayDetails("Student Record");

        System.out.println("\n=== RUNTIME POLYMORPHISM TEST ===");

        University[] entities = {
                Admin,
                professor,
                student,
                new Administration("Martha Mark", "ADM002", "Finance", "Accountant"),
                new University("Dr. Micheal", "PROF002", "Mathematics")
        };


        for (University entity : entities) {
            demonstrateAction(entity);
        }


        System.out.println("=== ADDITIONAL FEATURES DEMONSTRATION ===");


        System.out.println("--- Super Keyword Usage ---");
        Admin.manageResources();

        System.out.println("Final Variable Usage ---");
        System.out.println("Professor employment type: " + professor.getEmploymentType());

        System.out.println("\n--- Instanceof Operator Checks ---");
        System.out.println("admin instanceof University: " + (Admin instanceof University));
        System.out.println("professor instanceof Professor: " + (professor instanceof Professor));
        System.out.println("student instanceof Student: " + (student instanceof Student));
        System.out.println("admin instanceof Administration: " + (Admin instanceof Administration));

        System.out.println("\n--- Subclass Specific Methods ---");
        professor.conductResearch();
        student.attendClass();
    }
}

public class Professor extends University {
     String subject;
     final String EMPLOYMENT_TYPE = "FACULTY";

    public Professor(String name, String id, String subject name) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void performAction() {
        System.out.println("Professor action: " + name + " is teaching " + subject + " to students" professor);
    }


    public void conductResearch() {
        System.out.println(name + " is conducting research in " + subject);
    }

    public final String getEmploymentType() {
        return EMPLOYMENT_TYPE;
    }

    public String getSubject() {
        return subject;
    }
}
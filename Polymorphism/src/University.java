public class University {
     String name;
     String id;

    public University(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public University() {

    }

    public University(String P, String prof001, String computerScience) {
    }

    public void performAction() {
        System.out.println("Performing a general university action");
    }

    public final void displayDetails() {
        System.out.println("Default display: University Entity - " + name + " (ID: " + id + ")");
    }

    public final void displayDetails(String customMessage) {
        System.out.println("Custom display: " + customMessage + " - " + name + " (ID: " + id + ")");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

public class Administration extends University {
    private String department;
    private String role;

    public Administration(String name, String id, String department, String role, myrole) {
        super(name, id);
        this.department = department;
        this.role = role;
    }

    @Override
    public void performAction() {
        System.out.println("Administration action: " + name + " is managing " + department + " department as " + role, myrole);
    }

    public void manageResources() {
        super.performAction();
        System.out.println("Managing university resources efficiently");
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }
}
public final class Person {
    final String id;
    private final String name;
    private final String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public final String getId() {
        return id;
    }

    public final String getName() {
        return name;
    }

    public final String getEmail( private) {
        return email;
    }

    public final void displayBasicInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}
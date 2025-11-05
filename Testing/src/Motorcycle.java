public class Motorcycle extends Vehicle {
    private String type;
    private int engineCapacity;

    public Motorcycle(String make, String model, int year, double basePrice,
                      String type, int engineCapacity) {
        super(make, model, year, basePrice);
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
        System.out.println("Engine: " + engineCapacity + "cc");
        System.out.println("Base Price: $" + basePrice);
    }
}
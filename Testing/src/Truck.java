public class Truck extends Vehicle {
    private double cargoCapacity;
    private int numAxles;

    public Truck(String make, String model, int year, double basePrice,
                 double cargoCapacity, int numAxles) {
        super(make, model, year, basePrice);
        this.cargoCapacity = cargoCapacity;
        this.numAxles = numAxles;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Number of Axles: " + numAxles);
        System.out.println("Base Price: $" + basePrice);
    }
}
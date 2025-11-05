public class Car extends Vehicle {
    private int numDoors;
    String fuelType;

    public Car(String make, String model, int year, double basePrice,
               int numDoors, String fuelType) {
        super(make, model, year, basePrice);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Base Price: $" + basePrice);
    }
}
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String make, String model, int year, double basePrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public abstract void displayDetails();

    public double computeCost(int yearsOld) {
        double depreciationRate = 0.10;
        return basePrice * Math.pow(1 - depreciationRate, yearsOld);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2023, 25000, 4, "Gasoline");
        Vehicle motorcycle = new Motorcycle("Davidson", "Sportster", 2023, 12000, "Cruiser", 1200);
        Vehicle truck = new Truck("Ford", "F-150", 2023, 35000, 1.5, 2);

        System.out.println("=== VEHICLE DETAILS ===");
        car.displayDetails();
        System.out.println("Current value after 2 years: $" + car.computeCost(2));
        System.out.println();

        motorcycle.displayDetails();
        System.out.println("Current value after 2 years: $" + motorcycle.computeCost(2));
        System.out.println();

        truck.displayDetails();
        System.out.println("Current value after 2 years: $" + truck.computeCost(2));
        System.out.println();

        System.out.println("=== POLYMORPHISM DEMONSTRATION ===");
        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("3-year depreciation value: $" + vehicle.computeCost(3));
            System.out.println("-------------------");
        }
    }
}
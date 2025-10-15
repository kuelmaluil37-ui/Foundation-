public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println(name + " the " + breed + " says: Woof Woof!");
    }

    public void bark() {
        System.out.println(name + " is barking loudly!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }

    public void displayDogInfo() {
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}
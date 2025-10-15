public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        this.makeSound();
    }
    
    public void makeSound() {
        System.out.println(name + " the " + color + " cat says: Meow Meow!");
    }

    public void climb() {
        System.out.println(name + " is climbing a tree");
    }

    public void purr() {
        System.out.println(name + " is purring...");
    }

    public void displayCatInfo() {
        displayInfo();
        System.out.println("Color: " + color);
    }
}
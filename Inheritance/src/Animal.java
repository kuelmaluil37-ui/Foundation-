public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.makeSound();
    }
    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + " years");
    }
}
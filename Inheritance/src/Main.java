public class Main {
    public static void main(String[] args) {

        System.out.println(" Dog extends Animal:");
        System.out.println("------------------------------------------------");
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.displayDogInfo();
        myDog.makeSound();
        myDog.bark();
        myDog.eat();
        myDog.sleep();

        System.out.println("Puppy extends Dog:");
        System.out.println("------------------------------------------------");
        Puppy myPuppy = new Puppy("Max", 1, "Labrador", "Squeaky Toy");
        myPuppy.displayPuppyInfo();
        myPuppy.makeSound();
        myPuppy.bark();
        myPuppy.play();
        myPuppy.beCute();
        myPuppy.fetch();
        myPuppy.eat();

        System.out.println(" Cat extends Animal:");
        System.out.println("------------------------------------------------");
        Cat myCat = new Cat("Patient", 2, "White");
        myCat.displayCatInfo();
        myCat.makeSound();
        myCat.climb();
        myCat.purr();
        myCat.sleep();

        System.out.println("POLYMORPHISM DEMONSTRATION:");
        System.out.println("------------------------------------------------");
        Animal[] animals = new Animal[3];
        animals[0] = myDog;
        animals[1] = myPuppy;
        animals[2] = myCat;

        System.out.println("All animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("All animals eating:");
        System.out.println("------------------------------------------------");
        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println("All animals sleeping:");
        for (Animal animal : animals) {
            animal.sleep();
        }
    }
}
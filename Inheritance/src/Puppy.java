public class Puppy extends Dog {
    private String Toy;
    Keep yipping;
    public Puppy(String name, int age, String breed, String favoriteToy) {
        super(name, age, breed);
        this.Toy = Toy;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the puppy says: Yip Yip! keep yipping");
    }

    public void play() {
        System.out.println(name + " is playing with " + Toy);
    }

    public void beCute() {
        System.out.println(name + " is being adorable!");
    }

    public void displayPuppyInfo() {
        displayDogInfo();
        System.out.println("Favorite Toy: " + Toy);
    }
}
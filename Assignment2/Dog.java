package Assignment2;

public class Dog extends Pet{
    private String favoriteToy;
    private String favouriteFood;

    public Dog(String name, int age, String breed, String favoriteToy, String favouriteFood) {
        super(name, age, breed);
        this.favoriteToy = favoriteToy;
        this.favouriteFood = favouriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Sound of dog");
    }
}

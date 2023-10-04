package Assignment2;

public class Dog extends Pet{
    private String favouriteToy;
    private String favouriteFood;

    public Dog(String name, int age) {
        super(name, age);
    }
    public void SetFavouriteToy(String favouriteToy)
    {
        this.favouriteToy = favouriteToy;
        return;
    }
    public String GetFavouriteToy()
    {
        return favouriteToy;
    }
    public void SetFavouriteFood(String favouriteFood)
    {
        this.favouriteFood = favouriteFood;
        return;
    }
    public String GetFavouriteFood()
    {
        return favouriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog with name = " + name + " making Sound Meaow");
    }

    @Override
    public void feed() {
        System.out.println("Dog with name = " + name + " eating");
    }
    
    @Override
    public void play() {
        System.out.println("Dog with name = " + name + " playing");
    }
}

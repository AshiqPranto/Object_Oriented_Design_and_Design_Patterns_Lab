package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Owner implements IOwner{
    private String name;
    private int age;
    private String address;
    private String email;
    private List<Dog> dogs;
    private List<Cat> cats;
    private List<Bird> birds;
    private int numOfDog;
    private int numOfCat;
    private int numOfBird;
      
    public Owner(String name, int age, String address, String email)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        dogs = new ArrayList<>();
        numOfBird = 0;
        numOfDog = 0;
        numOfCat = 0;
    }
    // this function will return the added dog name
    @Override
    public String addDog(Dog newDog)
    {
        dogs.add(newDog);
        numOfDog++;
        return newDog.name;
    }
    @Override
    public List<Dog> getAllDogs()
    {
        return dogs;
    }
    // public String removeDog(Dog)
    @Override
    public String getOwnerName() {
        return name;
    }
    @Override
    public List<Cat> getAllCats() {
        return cats;
    }
    @Override
    public List<Bird> getAllBirds() {
        return birds;
    }
    @Override
    public String addCat(Cat newCat) {
        numOfCat++;
        cats.add(newCat);
        return newCat.name;
    }
    @Override
    public String addBird(Bird newBird) {
        numOfBird++;
        birds.add(newBird);
        return newBird.name;
    }
}

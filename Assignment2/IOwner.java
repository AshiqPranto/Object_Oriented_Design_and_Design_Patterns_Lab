package Assignment2;

import java.util.List;

public interface IOwner {
    String getOwnerName();

    List<Cat> getAllCats();
    List<Bird> getAllBirds();
    List<Dog> getAllDogs();

    String addDog(Dog newDog);
    String addCat(Cat newCat);
    String addBird(Bird newBird);
}

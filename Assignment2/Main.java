package Assignment2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of Owner");
        String ownerName = scanner.next();
        System.out.println("Enter the age of Owner");
        int ownerAge = scanner.nextInt();
        System.out.println("Enter the address of Owner");
        String ownerAddress = scanner.next();
        System.out.println("Enter the email of Owner");
        String ownerEmail = scanner.next();
        System.out.println(ownerName + ownerAge + ownerAddress + ownerEmail);

        IOwner owner = new Owner(ownerName, ownerAge, ownerAddress, ownerEmail);
        System.out.println("owner name = " + owner.getOwnerName());
        // IOwner owner = new Owner();

        String petName;
        int petAge;
        boolean checker = true;
        int option;
        while(checker)
        {
            System.out.println("0 -> Exit");
            System.out.println("1 -> Add a Cat");
            System.out.println("2 -> Add a Dog");
            System.out.println("3 -> Add a Bird");
            System.out.println("4 -> Show all cats");
            System.out.println("5 -> Show all dogs");
            System.out.println("6 -> Show all birds");

            option = scanner.nextInt();

            switch (option) {
                case 0:
                    checker = false;
                    break;
                case 1:
                    System.out.println("Enter Cat Name: ");
                    petName = scanner.next();
                    System.out.println("Enter Cat Age: ");
                    petAge = scanner.nextInt();
                    owner.addCat(new Cat(petName, petAge));
                    break;
                case 2:
                    System.out.println("Enter Dog Name: ");
                    petName = scanner.next();
                    System.out.println("Enter Dog Age: ");
                    petAge = scanner.nextInt();
                    owner.addDog(new Dog(petName, petAge));
                    break;
                case 3:
                    System.out.println("Enter Bird Name: ");
                    petName = scanner.next();
                    System.out.println("Enter Bird Age: ");
                    petAge = scanner.nextInt();
                    owner.addBird(new Bird(petName, petAge));
                    break;
                case 4:
                    List<Cat> cats = owner.getAllCats();
                    for(Cat cat : cats)
                    {
                        System.out.println("Cat name = " + cat.name);
                        System.out.println("Cat age = " + cat.age);
                    }
                    break;
                    case 5:
                    List<Dog> dogs = owner.getAllDogs();
                    for(Dog dog : dogs)
                    {
                        System.out.println("Dog name = " + dog.name);
                        System.out.println("Dog age = " + dog.age);
                    }
                    break;
                    case 6:
                    List<Bird> birds = owner.getAllBirds();
                    for(Bird bird : birds)
                    {
                        System.out.println("Bird name = " + bird.name);
                        System.out.println("Bird age = " + bird.age);
                    }
                    break;
                default:
                System.out.println("Invalid option selected");
                    break;
            }
        }
    }
}

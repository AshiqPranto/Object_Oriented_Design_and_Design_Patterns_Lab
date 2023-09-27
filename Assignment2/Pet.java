package Assignment2;

import java.time.LocalDate;

public class Pet {
    private String name;
    private int age;
    private String breed;
    private LocalDate lastMedicalCheckupDate;
    public Pet()
    {
        
    }

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void feed() {
        System.out.println("General feed function");
    }

    public void play() {
        System.out.println("General play function");
    }

    public void makeSound() {
        System.out.println("General make sound function");
    }
}

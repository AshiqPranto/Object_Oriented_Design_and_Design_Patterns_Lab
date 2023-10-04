package Assignment2;

import java.time.LocalDate;

public abstract class Pet {
    protected String name;
    protected int age;
    protected LocalDate lastMedicalCheckupDate;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void feed();

    public abstract void play();

    public abstract void makeSound();
}

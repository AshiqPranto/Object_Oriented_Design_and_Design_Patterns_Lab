package Assignment2;

public class Bird extends Pet{
    public Bird(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Bird with name = " + name + " eating");
    }
    
    @Override
    public void play() {
        System.out.println("Bird with name = " + name + " playing");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Bird with name = " + name + " making Sound Meaow");
    }
}

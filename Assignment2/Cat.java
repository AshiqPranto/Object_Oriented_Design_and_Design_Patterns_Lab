package Assignment2;

public class Cat extends Pet{
    
    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Cat with name = " + name + " eating");
    }
    
    @Override
    public void play() {
        System.out.println("Cat with name = " + name + " playing");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cat with name = " + name + " making Sound Meaow");
    }
}

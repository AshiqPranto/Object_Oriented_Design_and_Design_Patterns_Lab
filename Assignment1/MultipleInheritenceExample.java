package Assignment1;

interface ParentClass1{
    default void show()
    {
        System.out.println("I am from Parent Class 1 show method");
    }
}

interface ParentClass2{
    default void show()
    {
        System.out.println("I am from Parent Class 2 show method");
    }
}

public class MultipleInheritenceExample implements ParentClass1, ParentClass2{

    @Override
    public void show()
    {
        ParentClass1.super.show();

        ParentClass2.super.show();
    }
    public static void main(String[] args) {
        MultipleInheritenceExample obj = new MultipleInheritenceExample();
        obj.show();
    }
}
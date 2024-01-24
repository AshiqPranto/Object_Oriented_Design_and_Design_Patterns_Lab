package Assignment5_Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        IImage image = new ProxyImage("BirdSketch.jpg");
        image.display();
        System.out.println();
        System.out.println();
        image.display();
    }
}

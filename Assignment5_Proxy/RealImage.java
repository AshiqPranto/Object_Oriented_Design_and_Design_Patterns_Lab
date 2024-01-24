package Assignment5_Proxy;

public class RealImage implements IImage {

    String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        LoadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    public void LoadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
    
}

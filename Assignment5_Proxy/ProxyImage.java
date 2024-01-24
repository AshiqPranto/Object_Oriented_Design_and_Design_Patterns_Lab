// package Assignment5_Proxy;

public class ProxyImage implements IImage {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public void display() {
        if(realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }
    
}

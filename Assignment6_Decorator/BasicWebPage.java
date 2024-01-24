// package Assignment6_Decorator;

public class BasicWebPage implements IWebPage{

    public String html = "Html code for BasicWebPage";
    public String styleSheet = "Css styleSheet for BasicWebPage";
    public String script = "Script for BasicWebPage";

    @Override
    public void display() {
        System.out.println("Displaying from BasicWebPage");
    }
    
}

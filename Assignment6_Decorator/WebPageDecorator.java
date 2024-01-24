// package Assignment6_Decorator;

public abstract class WebPageDecorator implements IWebPage{

    protected IWebPage webPage;

    public WebPageDecorator(IWebPage webPage){
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
    
}

// package Assignment6_Decorator;

public class AuthenticatedWebPage extends WebPageDecorator{

    public AuthenticatedWebPage(IWebPage webPage) {
        super(webPage);
    }

    public void AuthenticateUser(){
        System.out.println("Authenticating user");
    }

    @Override
    public void display(){
        super.display();
        this.AuthenticateUser();
    }
    
}

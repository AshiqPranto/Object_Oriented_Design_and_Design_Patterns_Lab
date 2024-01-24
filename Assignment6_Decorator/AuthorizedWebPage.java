// package Assignment6_Decorator;

public class AuthorizedWebPage extends WebPageDecorator{

    public AuthorizedWebPage(IWebPage webPage) {
        super(webPage);
    }

    public void authorizedUser(){
        System.out.println("Authorizing User");
    }
    
    @Override
    public void display(){
        super.display();
        authorizedUser();
    }
}

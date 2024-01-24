// package Assignment6_Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        IWebPage myWebPage = new BasicWebPage();
        myWebPage = new AuthorizedWebPage(myWebPage);
        // myWebPage.display();
        System.out.println();
        System.out.println();
        myWebPage = new AuthenticatedWebPage(myWebPage);
        myWebPage.display();
    }
}

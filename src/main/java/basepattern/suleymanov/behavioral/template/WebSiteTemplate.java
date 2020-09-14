package basepattern.suleymanov.behavioral.template;

public abstract class WebSiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();


}

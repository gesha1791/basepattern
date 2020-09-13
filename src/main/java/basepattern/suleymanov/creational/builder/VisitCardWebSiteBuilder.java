package basepattern.suleymanov.creational.builder;

public class VisitCardWebSiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        webSite.setName("VisitCard");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}

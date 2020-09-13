package basepattern.suleymanov.creational.builder;

public class EnterpriceWebSiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}

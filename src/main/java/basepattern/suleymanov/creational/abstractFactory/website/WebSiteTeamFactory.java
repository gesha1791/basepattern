package basepattern.suleymanov.creational.abstractFactory.website;

import basepattern.suleymanov.creational.abstractFactory.Developer;
import basepattern.suleymanov.creational.abstractFactory.ProjectManager;
import basepattern.suleymanov.creational.abstractFactory.ProjectTeamFactory;
import basepattern.suleymanov.creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new WebSitePM();
    }
}

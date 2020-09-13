package basepattern.suleymanov.creational.abstractFactory.website;

import basepattern.suleymanov.creational.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website PM manages website project");
    }
}

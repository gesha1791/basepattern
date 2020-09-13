package basepattern.suleymanov.creational.abstractFactory;

import basepattern.suleymanov.creational.abstractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getPM();

        System.out.println("Create auction");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }

}

package basepattern.suleymanov.creational.abstractFactory.banking;

import basepattern.suleymanov.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects");
    }
}

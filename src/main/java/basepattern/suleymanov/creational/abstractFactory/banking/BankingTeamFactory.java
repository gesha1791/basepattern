package basepattern.suleymanov.creational.abstractFactory.banking;

import basepattern.suleymanov.creational.abstractFactory.Developer;
import basepattern.suleymanov.creational.abstractFactory.ProjectManager;
import basepattern.suleymanov.creational.abstractFactory.ProjectTeamFactory;
import basepattern.suleymanov.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingPM();
    }
}

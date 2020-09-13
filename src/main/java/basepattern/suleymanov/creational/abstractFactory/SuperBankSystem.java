package basepattern.suleymanov.creational.abstractFactory;

import basepattern.suleymanov.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getPM();

        System.out.println("Creating banking system");

        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}

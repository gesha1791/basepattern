package basepattern.suleymanov.creational.abstractFactory.website;

import basepattern.suleymanov.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}

package basepattern.suleymanov.creational.abstractFactory.banking;

import basepattern.suleymanov.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write java code");
    }
}

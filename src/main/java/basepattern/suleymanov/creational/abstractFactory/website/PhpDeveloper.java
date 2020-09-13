package basepattern.suleymanov.creational.abstractFactory.website;

import basepattern.suleymanov.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php write code");
    }
}

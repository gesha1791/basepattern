package basepattern.suleymanov.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperGetSpecialty("java"));
        developers.add(developerFactory.getDeveloperGetSpecialty("java"));
        developers.add(developerFactory.getDeveloperGetSpecialty("java"));
        developers.add(developerFactory.getDeveloperGetSpecialty("java"));
        developers.add(developerFactory.getDeveloperGetSpecialty("c++"));
        developers.add(developerFactory.getDeveloperGetSpecialty("c++"));
        developers.add(developerFactory.getDeveloperGetSpecialty("c++"));
        developers.add(developerFactory.getDeveloperGetSpecialty("c++"));

        for(Developer d : developers){
            d.writeCode();
        }

    }
}

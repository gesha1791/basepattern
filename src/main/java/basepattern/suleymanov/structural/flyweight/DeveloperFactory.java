package basepattern.suleymanov.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperGetSpecialty(String specialty){
        Developer developer = developers.get(specialty);

        if(developer == null){
            switch (specialty){
                case "java":
                    System.out.println("Hiring Java developer ");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring Cpp developer ");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}

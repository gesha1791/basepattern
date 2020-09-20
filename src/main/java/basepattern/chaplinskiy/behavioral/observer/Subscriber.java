package basepattern.chaplinskiy.behavioral.observer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Map<String, Double> prices) {
        System.out.println("Dear " + name + "\nWe have some changes in prices in Binance exchange :\n");
        Set<Map.Entry<String, Double>> entries = prices.entrySet();

        for(Map.Entry<String, Double> e :entries){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
}

package basepattern.chaplinskiy.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinancePriceUpdates implements Observed {
    Map<String, Double> prices = new HashMap<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addPrices(String currency, Double prices){
        this.prices.put(currency, prices);
        notifyObservers();
    }

    public void removePrices(String currency){
        this.prices.remove(currency);
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : subscribers){
            o.handleEvent(prices);
        }
    }
}

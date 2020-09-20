package basepattern.chaplinskiy.behavioral.observer;

import java.util.Map;

public interface Observer {
    public void handleEvent(Map<String, Double> prices);
}

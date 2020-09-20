package basepattern.chaplinskiy.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class OrderFactory {
    private static final Map<String, Order> orders = new HashMap<>();

    public Order orderGetByCategory(String category){
        Order order = orders.get(category);

        if(order == null){
            switch (category){
                case "limit":
                    System.out.println("Create limit order");
                    order = new LimitOrder();
                    break;
                case "market":
                    System.out.println("Create market order");
                    order = new MarketOrder();
                    break;
            }
            orders.put(category, order);
        }
        return order;
    }
}

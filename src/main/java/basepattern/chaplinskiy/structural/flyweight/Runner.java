package basepattern.chaplinskiy.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();

        List<Order> orders = new ArrayList<>();

        orders.add(orderFactory.orderGetByCategory("limit"));
        orders.add(orderFactory.orderGetByCategory("limit"));
        orders.add(orderFactory.orderGetByCategory("limit"));
        orders.add(orderFactory.orderGetByCategory("limit"));
        orders.add(orderFactory.orderGetByCategory("limit"));
        orders.add(orderFactory.orderGetByCategory("market"));
        orders.add(orderFactory.orderGetByCategory("market"));
        orders.add(orderFactory.orderGetByCategory("market"));
        orders.add(orderFactory.orderGetByCategory("market"));
        orders.add(orderFactory.orderGetByCategory("market"));

        orders.stream().forEach(Order::createOrder);
    }
}

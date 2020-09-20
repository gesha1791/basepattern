package basepattern.chaplinskiy.structural.flyweight;

public class MarketOrder implements Order {
    @Override
    public void createOrder() {
        System.out.println("Buy market position");
    }
}

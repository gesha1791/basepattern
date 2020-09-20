package basepattern.chaplinskiy.structural.flyweight;

public class LimitOrder implements Order {
    @Override
    public void createOrder() {
        System.out.println("Buy limit position");
    }
}

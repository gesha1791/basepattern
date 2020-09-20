package basepattern.chaplinskiy.behavioral.template;

import java.math.BigDecimal;

public abstract class OrderTemplate {
    public void createOrder(BigDecimal price){
        System.out.println("Create limit order");
        createPriceOrder(price);
        System.out.println("Execute limit order");
    }

    protected abstract void createPriceOrder(BigDecimal price);

}

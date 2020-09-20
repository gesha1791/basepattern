package basepattern.chaplinskiy.behavioral.template;

import java.math.BigDecimal;

public class OrderRunner {
    public static void main(String[] args) {
        OrderTemplate limitOrder = new LimitOrder();
        OrderTemplate stopOrder = new StopOrder();

        BigDecimal priceBTC = BigDecimal.valueOf(9154);

        limitOrder.createOrder(priceBTC);

        System.out.println("=====================================");

        stopOrder.createOrder(priceBTC);


    }
}

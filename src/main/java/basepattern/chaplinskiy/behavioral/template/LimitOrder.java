package basepattern.chaplinskiy.behavioral.template;

import java.math.BigDecimal;

public class LimitOrder extends OrderTemplate {
    @Override
    protected void createPriceOrder(BigDecimal price) {
        System.out.println("Price current price plus 2 dollars: " + price.add(BigDecimal.valueOf(2)));
    }
}

package basepattern.chaplinskiy.behavioral.template;

import java.math.BigDecimal;

public class StopOrder extends OrderTemplate {
    @Override
    protected void createPriceOrder(BigDecimal price) {
        System.out.println("Price current price minus 5 dollars: " + price.subtract(BigDecimal.valueOf(5)));
    }
}

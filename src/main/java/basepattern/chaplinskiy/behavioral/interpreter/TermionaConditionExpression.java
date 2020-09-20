package basepattern.chaplinskiy.behavioral.interpreter;

import java.math.BigDecimal;

public class TermionaConditionExpression implements ConditionExpression {
    private BigDecimal currentPrice;

    public TermionaConditionExpression(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }


    @Override
    public boolean interpretet(BigDecimal price) {
        if (price.compareTo(currentPrice) > 0){
            return true;
        }

        return false;
    }
}

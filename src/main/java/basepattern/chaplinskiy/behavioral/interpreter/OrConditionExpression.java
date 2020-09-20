package basepattern.chaplinskiy.behavioral.interpreter;

import java.math.BigDecimal;

public class OrConditionExpression implements ConditionExpression {
    ConditionExpression conditionExpressionPriceHigh;
    ConditionExpression conditionExpressionPriceLow;

    public OrConditionExpression(ConditionExpression conditionExpressionPriceHigh,
                                  ConditionExpression conditionExpressionPriceLow) {
        this.conditionExpressionPriceHigh = conditionExpressionPriceHigh;
        this.conditionExpressionPriceLow = conditionExpressionPriceLow;
    }

    @Override
    public boolean interpretet(BigDecimal price) {
        return conditionExpressionPriceHigh.interpretet(price) || conditionExpressionPriceLow.interpretet(price);
    }
}

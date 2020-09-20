package basepattern.chaplinskiy.behavioral.interpreter;

import java.math.BigDecimal;

public class AndConditionExpression implements ConditionExpression {
    ConditionExpression conditionExpressionPriceHigh;
    ConditionExpression conditionExpressionPriceLow;

    public AndConditionExpression(ConditionExpression conditionExpressionPriceHigh,
                                  ConditionExpression conditionExpressionPriceLow) {
        this.conditionExpressionPriceHigh = conditionExpressionPriceHigh;
        this.conditionExpressionPriceLow = conditionExpressionPriceLow;
    }

    @Override
    public boolean interpretet(BigDecimal price) {
        return conditionExpressionPriceHigh.interpretet(price) && conditionExpressionPriceLow.interpretet(price);
    }
}

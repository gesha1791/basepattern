package basepattern.chaplinskiy.behavioral.interpreter;


import java.math.BigDecimal;

public class InterpreterRunner {
    public static void main(String[] args) {
        ConditionExpression strategyFirst = getFirstStrategyCondition();
        ConditionExpression strategySecond = getSecondStrategyCondition();

        System.out.println(strategyFirst.interpretet(BigDecimal.valueOf(6543)));
        System.out.println(strategySecond.interpretet(BigDecimal.valueOf(6543)));

    }

    private static ConditionExpression getSecondStrategyCondition() {

        ConditionExpression priceHigh = new TermionaConditionExpression(BigDecimal.valueOf(6543));
        ConditionExpression priceLow = new TermionaConditionExpression(BigDecimal.valueOf(6523));

        return new AndConditionExpression(priceHigh, priceLow);
    }

    private static ConditionExpression getFirstStrategyCondition() {

        ConditionExpression priceHigh = new TermionaConditionExpression(BigDecimal.valueOf(6543));
        ConditionExpression priceLow = new TermionaConditionExpression(BigDecimal.valueOf(6523));

        return new OrConditionExpression(priceHigh, priceLow);
    }
}

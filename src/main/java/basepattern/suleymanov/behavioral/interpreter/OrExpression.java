package basepattern.suleymanov.behavioral.interpreter;

public class OrExpression implements Expression{
    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpretet(String context) {
        return expression1.interpretet(context) || expression2.interpretet(context);
    }
}

package basepattern.suleymanov.behavioral.interpreter;

public class TermionalExpression implements Expression {
    private String data;

    public TermionalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpretet(String context) {
        if (context.contains(data)){
            return true;
        }

        return false;
    }
}

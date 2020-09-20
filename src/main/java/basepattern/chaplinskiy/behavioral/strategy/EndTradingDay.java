package basepattern.chaplinskiy.behavioral.strategy;

public class EndTradingDay implements Phase {
    @Override
    public void execute() {
        System.out.println("Finish trading day, and go home");
    }
}

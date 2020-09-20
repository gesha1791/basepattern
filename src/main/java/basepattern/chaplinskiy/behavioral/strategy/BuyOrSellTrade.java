package basepattern.chaplinskiy.behavioral.strategy;

public class BuyOrSellTrade implements Phase {
    @Override
    public void execute() {
        System.out.println("Buying or selling trades");
    }
}

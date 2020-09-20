package basepattern.chaplinskiy.behavioral.state;

public class BuyOrSellTrade implements Phase {
    @Override
    public void execute() {
        System.out.println("Buying or selling trades");
    }
}

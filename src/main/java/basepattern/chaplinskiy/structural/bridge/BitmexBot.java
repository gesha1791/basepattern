package basepattern.chaplinskiy.structural.bridge;

public class BitmexBot extends Exchange {
    public BitmexBot(Strategy strategy) {
        super(strategy);
    }

    @Override
    public void runStrategy() {
        System.out.println("Bitmex bot");
        strategy.trading();
    }
}

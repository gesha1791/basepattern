package basepattern.chaplinskiy.structural.bridge;

public class BinanceBot extends Exchange{
    public BinanceBot(Strategy strategy) {
        super(strategy);
    }

    @Override
    public void runStrategy() {
        System.out.println("Binance bot");
        strategy.trading();
    }
}

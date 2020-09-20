package basepattern.chaplinskiy.behavioral.strategy;

public class TraderDay {
    public static void main(String[] args) {
        Trader trader = new Trader();

        trader.setPhase(new ReadNews());
        trader.execute();

        trader.setPhase(new AnalyzeStocks());
        trader.execute();

        trader.setPhase(new BuyOrSellTrade());
        trader.execute();

        trader.setPhase(new EndTradingDay());
        trader.execute();

        trader.setPhase(new ReadNews());
        trader.execute();
    }
}

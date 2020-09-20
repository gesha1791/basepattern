package basepattern.chaplinskiy.structural.facade;

public class Trade {
    Trader trader = new Trader();
    AnalyzeTrading analyze = new AnalyzeTrading();
    Task task = new Task();

    public void beginTradingDay() {
        task.doTask();
        analyze.satartAnalyzePosition();
        trader.createPosition(analyze);
    }
}

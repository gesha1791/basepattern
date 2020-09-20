package basepattern.chaplinskiy.behavioral.memento;

public class RunnerStrategy {
    public static void main(String[] args) throws InterruptedException {
        TradingStrategy tradingStrategy = new TradingStrategy();
        CsvData csvData = new CsvData();

        System.out.println("Creating new strategy. Version 1.0");
        tradingStrategy.setDateAndVersion("Version 1.0");

        System.out.println(tradingStrategy);

        System.out.println("Saving current version");
        csvData.setSave(tradingStrategy.save());

        System.out.println("Updating strategy to version 1.1");

        System.out.println("Add analyze orderbook");

        Thread.sleep(5000);

        tradingStrategy.setDateAndVersion("Version 1.0.1");

        System.out.println(tradingStrategy);

        System.out.println("Strategy work very bad");

        System.out.println("Add analyze bid/ask");

        tradingStrategy.setDateAndVersion("Version 1.0.2");

        System.out.println("Strategy work very very bad");

        System.out.println("Rolling back to version 1.0");

        tradingStrategy.load(csvData.getSave());
        System.out.println("Strategy after rollback");

        System.out.println(tradingStrategy);
    }
}

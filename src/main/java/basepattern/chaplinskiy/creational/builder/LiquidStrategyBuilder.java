package basepattern.chaplinskiy.creational.builder;

public class LiquidStrategyBuilder extends BotBuilder {
    @Override
    void buildName() {
        bot.setName("Liquid");
    }

    @Override
    void buildStrategy() {
        bot.setStrategy("LiquidStrategy");
    }

    @Override
    void buildBalance() {
        bot.setBalance(String.valueOf(10000));
    }

    @Override
    void buildExchange() {
        bot.setExchange(Exchange.BINANCE);
    }
}

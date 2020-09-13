package basepattern.chaplinskiy.creational.builder;

public class LongStrategyBuilder extends BotBuilder {
    @Override
    void buildName() {
        bot.setName("Long");
    }

    @Override
    void buildStrategy() {
        bot.setStrategy("LongStrategy");
    }

    @Override
    void buildBalance() {
        bot.setBalance("10000");
    }

    @Override
    void buildExchange() {
        bot.setExchange(Exchange.BINANCE);
    }
}

package basepattern.chaplinskiy.creational.factory;

public class Main {
    public static void main(String[] args) {
        CreateBotFactory factoryBinance = createBotByExchange(Exchanges.BINANCE);
        Bot botBinance = factoryBinance.createBot();

        CreateBotFactory factoryBitfinex = createBotByExchange(Exchanges.BITFINEX);
        Bot botBitfinex = factoryBitfinex.createBot();

        CreateBotFactory factoryBitmex = createBotByExchange(Exchanges.BITMEX);
        Bot botBitmex = factoryBitmex.createBot();

        botBinance.trade();
        botBitfinex.trade();
        botBitmex.trade();

    }

    private static CreateBotFactory createBotByExchange(Exchanges name) {
        if (name.equals(Exchanges.BINANCE)){
            return new BinaneBotFactory();
        } else if (name.equals(Exchanges.BITFINEX)){
            return new BitfinexBotFactory();
        } else if (name.equals(Exchanges.BITMEX)){
            return new BitmexBotFactory();
        } else {
            throw new RuntimeException((name + " is unknown excnahges"));
        }
    }
}

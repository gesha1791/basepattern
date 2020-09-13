package basepattern.chaplinskiy.creational.factory;

public class BinaneBotFactory implements CreateBotFactory {
    @Override
    public Bot createBot() {
        return new BinanceBot();
    }
}

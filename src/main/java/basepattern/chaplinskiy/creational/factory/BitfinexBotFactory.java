package basepattern.chaplinskiy.creational.factory;

public class BitfinexBotFactory implements CreateBotFactory {
    @Override
    public Bot createBot() {
        return new BitfinexBot();
    }
}

package basepattern.chaplinskiy.creational.factory;

public class BitmexBotFactory implements CreateBotFactory {
    @Override
    public Bot createBot() {
        return new BitmexBot();
    }
}

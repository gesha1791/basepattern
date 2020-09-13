package basepattern.chaplinskiy.creational.builder;

public abstract class BotBuilder {
    Bot bot;

    void createBot(){
        bot = new Bot();
    }

    abstract void buildName();
    abstract void buildStrategy();
    abstract void buildBalance();
    abstract void buildExchange();

    Bot getBot() {
        return bot;
    }
}

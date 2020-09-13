package basepattern.chaplinskiy.creational.builder;

public class Director {
    BotBuilder botBuilder;

    public void setBotBuilder(BotBuilder botBuilder) {
        this.botBuilder = botBuilder;
    }

    Bot buildBot(){
        botBuilder.createBot();
        botBuilder.buildName();
        botBuilder.buildStrategy();
        botBuilder.buildBalance();
        botBuilder.buildExchange();

        Bot bot = botBuilder.getBot();
        return bot;
    }
}

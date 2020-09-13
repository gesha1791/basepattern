package basepattern.chaplinskiy.creational.prototype;

public class VersionBotRunner {
    public static void main(String[] args) {
        Bot bot = new Bot(1, "SMA", "Binance", "MA50");

        System.out.println(bot);

        BotFactory botFactory = new BotFactory(bot);
        Bot bot1 = botFactory.cloneBot();

        System.out.println(bot1);
    }
}

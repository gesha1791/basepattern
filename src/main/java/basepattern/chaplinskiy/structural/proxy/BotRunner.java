package basepattern.chaplinskiy.structural.proxy;

public class BotRunner {
    public static void main(String[] args) {
        Bot bot = new ProxyBot("Binance");
        bot.run();
    }
}

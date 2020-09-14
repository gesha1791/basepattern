package basepattern.chaplinskiy.structural.bridge;

public class BotCreator {
    public static void main(String[] args) {
        Exchange [] bots = {
                new BinanceBot(new ShortStrategy()),
            new BitmexBot(new LongStrategy())
        };

        for(Exchange b : bots){
            b.runStrategy();
        }
    }
}

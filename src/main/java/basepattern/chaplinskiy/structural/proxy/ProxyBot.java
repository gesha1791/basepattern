package basepattern.chaplinskiy.structural.proxy;

public class ProxyBot implements Bot {
    private String exchangeName;
    private RealBot bot;

    public ProxyBot(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    @Override
    public void run() {
        if(bot == null){
            bot = new RealBot(exchangeName);
        }
        bot.run();
    }
}

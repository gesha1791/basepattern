package basepattern.chaplinskiy.creational.prototype;

public class BotFactory {
    Bot bot;

    public BotFactory(Bot bot) {
        this.bot = bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public Bot cloneBot(){
        return (Bot)bot.copy();
    }
}

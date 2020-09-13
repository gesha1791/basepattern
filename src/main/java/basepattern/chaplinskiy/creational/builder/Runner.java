package basepattern.chaplinskiy.creational.builder;

public class Runner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBotBuilder(new LiquidStrategyBuilder());

        Bot bot = director.buildBot();

        System.out.println(bot);

    }
}

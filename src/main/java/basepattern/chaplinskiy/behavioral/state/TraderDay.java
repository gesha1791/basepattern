package basepattern.chaplinskiy.behavioral.state;

public class TraderDay {
    public static void main(String[] args) {
        Trader trader = new Trader();
        Phase readNews = new ReadNews();

        trader.setPhase(readNews);

        for (int i = 0; i < 10; i++) {
            trader.execute();
            trader.changePhases();
        }
    }
}

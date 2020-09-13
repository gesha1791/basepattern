package basepattern.chaplinskiy.creational.factory;

public class BinanceBot implements Bot {
    @Override
    public void trade() {
        System.out.println("Begin trading on Binance exchange");
    }
}

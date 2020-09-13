package basepattern.chaplinskiy.creational.factory;

public class BitfinexBot implements Bot {
    @Override
    public void trade() {
        System.out.println("Begin trading on Bitfinex exchange");
    }
}

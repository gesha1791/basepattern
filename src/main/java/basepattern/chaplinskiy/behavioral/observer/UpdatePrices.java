package basepattern.chaplinskiy.behavioral.observer;


public class UpdatePrices {
    public static void main(String[] args) {
        BinancePriceUpdates binancePriceUpdates = new BinancePriceUpdates();

        binancePriceUpdates.addPrices("BTC", 9987.23);
        binancePriceUpdates.addPrices("ETH", 343.23);

        Observer firstSubscriber = new Subscriber("Eugene");
        Observer secongSubscriber = new Subscriber("Peter");

        binancePriceUpdates.addObserver(firstSubscriber);
        binancePriceUpdates.addObserver(secongSubscriber);

        binancePriceUpdates.addPrices("XRP", 0.23123412);

        binancePriceUpdates.removePrices("XRP");


    }
}

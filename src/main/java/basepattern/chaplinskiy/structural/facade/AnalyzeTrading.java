package basepattern.chaplinskiy.structural.facade;

public class AnalyzeTrading {
    private boolean activeMarket;

    public boolean isActiveMarket() {
        return activeMarket;
    }

    public void satartAnalyzePosition() {
        System.out.println("Analyze market, create long or short position");
        activeMarket = true;
    }
}

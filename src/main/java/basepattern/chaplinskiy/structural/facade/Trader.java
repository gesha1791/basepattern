package basepattern.chaplinskiy.structural.facade;

public class Trader {
    public void createPosition(AnalyzeTrading analyze) {
        if(analyze.isActiveMarket()){
            System.out.println("Trader buy or sell positions");
        }
    }
}

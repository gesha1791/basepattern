package basepattern.chaplinskiy.behavioral.state;

public class Trader {
    private Phase phase;

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public void changePhases(){
        if (phase instanceof ReadNews){
            setPhase(new AnalyzeStocks());
        } else if (phase instanceof AnalyzeStocks){
            setPhase(new BuyOrSellTrade());
        } else if (phase instanceof BuyOrSellTrade){
            setPhase(new EndTradingDay());
        } else if (phase instanceof EndTradingDay) {
            setPhase(new ReadNews());
        }
    }

    public void execute(){
        phase.execute();
    }
}

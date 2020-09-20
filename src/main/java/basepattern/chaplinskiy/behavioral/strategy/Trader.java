package basepattern.chaplinskiy.behavioral.strategy;

public class Trader {
    private Phase phase;

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public void execute(){
        phase.execute();
    }
}

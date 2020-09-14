package basepattern.chaplinskiy.structural.bridge;

public abstract class Exchange {
    protected Strategy strategy;

    public Exchange(Strategy strategy) {
        this.strategy = strategy;
    }

    public abstract void runStrategy();
}

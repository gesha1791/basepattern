package basepattern.chaplinskiy.creational.builder;

public class Bot {
    private String name;
    private String strategy;
    private String balance;
    private Exchange exchange;

    public void setName(String name) {
        this.name = name;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                ", strategy='" + strategy + '\'' +
                ", balance='" + balance + '\'' +
                ", exchange=" + exchange +
                '}';
    }
}

package basepattern.chaplinskiy.creational.prototype;

public class Bot implements Copyable {
    private int id;
    private String name;
    private String exchange;
    private String strategy;

    public Bot(int id, String name, String exchange, String strategy) {
        this.id = id;
        this.name = name;
        this.exchange = exchange;
        this.strategy = strategy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public Object copy() {
        Bot copy = new Bot(id, name, exchange, strategy);
        return copy;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", exchange='" + exchange + '\'' +
                ", strategy='" + strategy + '\'' +
                '}';
    }
}

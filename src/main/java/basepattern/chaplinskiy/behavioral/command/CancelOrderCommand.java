package basepattern.chaplinskiy.behavioral.command;

public class CancelOrderCommand implements CommandBot {
    Exchange exchange;

    public CancelOrderCommand(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public void execute() {
        exchange.cancelOrder();
    }
}

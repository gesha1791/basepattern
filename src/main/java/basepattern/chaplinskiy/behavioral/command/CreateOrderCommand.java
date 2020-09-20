package basepattern.chaplinskiy.behavioral.command;

public class CreateOrderCommand implements CommandBot {
    Exchange exchange;

    public CreateOrderCommand(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public void execute() {
        exchange.createOrder();
    }
}

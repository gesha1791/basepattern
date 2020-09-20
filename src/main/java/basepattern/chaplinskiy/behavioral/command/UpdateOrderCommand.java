package basepattern.chaplinskiy.behavioral.command;

public class UpdateOrderCommand implements CommandBot {
    Exchange exchange;

    public UpdateOrderCommand(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public void execute() {
        exchange.updateOrder();
    }
}

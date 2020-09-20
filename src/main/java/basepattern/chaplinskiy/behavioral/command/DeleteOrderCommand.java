package basepattern.chaplinskiy.behavioral.command;

public class DeleteOrderCommand implements CommandBot {
    Exchange exchange;

    public DeleteOrderCommand(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public void execute() {
        exchange.removeOrder();
    }
}

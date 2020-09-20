package basepattern.chaplinskiy.behavioral.command;

public class ExchangeRunner {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();

        Bot bot = new Bot(
                new CreateOrderCommand(exchange),
                new CancelOrderCommand(exchange),
                new UpdateOrderCommand(exchange),
                new DeleteOrderCommand(exchange)
        );

        bot.createOrder();
        bot.cancelOrder();
        bot.updateOrder();
        bot.deleteOrder();
    }
}

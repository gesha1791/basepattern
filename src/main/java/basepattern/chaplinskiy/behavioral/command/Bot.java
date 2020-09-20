package basepattern.chaplinskiy.behavioral.command;

public class Bot {
    CommandBot createOrder;
    CommandBot cancelOrder;
    CommandBot updateOrder;
    CommandBot deleteOrder;

    public Bot(CommandBot createOrder, CommandBot cancelOrder, CommandBot updateOrder, CommandBot deleteOrder) {
        this.createOrder = createOrder;
        this.cancelOrder = cancelOrder;
        this.updateOrder = updateOrder;
        this.deleteOrder = deleteOrder;
    }

    public void createOrder(){
        createOrder.execute();
    }

    public void cancelOrder(){
        cancelOrder.execute();
    }

    public void updateOrder(){
        updateOrder.execute();
    }

    public void deleteOrder(){
        deleteOrder.execute();
    }


}

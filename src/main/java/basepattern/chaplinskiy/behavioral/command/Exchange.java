package basepattern.chaplinskiy.behavioral.command;

public class Exchange {
    public void createOrder(){
        System.out.println("Create order on exchange");
    }

    public void cancelOrder(){
        System.out.println("Cancel order on exchange");
    }

    public void updateOrder(){
        System.out.println("Update order on exchange");
    }

    public void removeOrder(){
        System.out.println("Remove order on exchange");
    }
}

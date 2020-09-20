package basepattern.suleymanov.behavioral.chainOfResponsibility;

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}

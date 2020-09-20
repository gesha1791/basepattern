package basepattern.suleymanov.behavioral.chainOfResponsibility;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Sending email: " + message);
    }
}

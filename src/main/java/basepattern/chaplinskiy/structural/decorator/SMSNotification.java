package basepattern.chaplinskiy.structural.decorator;

public class SMSNotification implements Message {
    @Override
    public String sendMessage() {
        return "Send sms message";
    }
}

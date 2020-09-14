package basepattern.chaplinskiy.structural.decorator;

public class TelephoneNotification extends MessageDecorator {

    public TelephoneNotification(Message message) {
        super(message);
    }

    public String sendMessageTelephone(){
        return "Send sms telephone";
    }

    @Override
    public String sendMessage() {
        return super.sendMessage() + "\n" + sendMessageTelephone();
    }
}

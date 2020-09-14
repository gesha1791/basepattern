package basepattern.chaplinskiy.structural.decorator;

public class EmailNotification extends MessageDecorator {

    public EmailNotification(Message message) {
        super(message);
    }

    public String sendMessageEmail(){
        return "Send message to mail";
    }

    @Override
    public String sendMessage() {
        return super.sendMessage() + "\n" + sendMessageEmail();
    }
}

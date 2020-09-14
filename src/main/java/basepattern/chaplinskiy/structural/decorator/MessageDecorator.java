package basepattern.chaplinskiy.structural.decorator;

public class MessageDecorator implements Message {
    Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String sendMessage() {
        return message.sendMessage();
    }
}

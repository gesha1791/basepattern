package basepattern.chaplinskiy.creational.abstractFactory.ios;

import basepattern.chaplinskiy.creational.abstractFactory.Message;

public class MessageIOS implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Send IOS message");
    }
}

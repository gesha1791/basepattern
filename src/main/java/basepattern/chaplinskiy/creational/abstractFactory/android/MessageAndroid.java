package basepattern.chaplinskiy.creational.abstractFactory.android;

import basepattern.chaplinskiy.creational.abstractFactory.Message;

public class MessageAndroid implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Send android message");
    }
}

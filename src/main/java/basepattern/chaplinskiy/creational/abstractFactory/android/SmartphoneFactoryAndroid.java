package basepattern.chaplinskiy.creational.abstractFactory.android;

import basepattern.chaplinskiy.creational.abstractFactory.Call;
import basepattern.chaplinskiy.creational.abstractFactory.Message;
import basepattern.chaplinskiy.creational.abstractFactory.SmartphoneFactory;
import basepattern.chaplinskiy.creational.abstractFactory.WiFi;

public class SmartphoneFactoryAndroid implements SmartphoneFactory {
    @Override
    public Message getMessage() {
        return new MessageAndroid();
    }

    @Override
    public Call getCall() {
        return new CallAndroid();
    }

    @Override
    public WiFi getWiFi() {
        return new WiFiAndroid();
    }
}

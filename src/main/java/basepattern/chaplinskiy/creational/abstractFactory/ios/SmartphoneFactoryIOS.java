package basepattern.chaplinskiy.creational.abstractFactory.ios;

import basepattern.chaplinskiy.creational.abstractFactory.Call;
import basepattern.chaplinskiy.creational.abstractFactory.Message;
import basepattern.chaplinskiy.creational.abstractFactory.SmartphoneFactory;
import basepattern.chaplinskiy.creational.abstractFactory.WiFi;

public class SmartphoneFactoryIOS implements SmartphoneFactory {
    @Override
    public Message getMessage() {
        return new MessageIOS();
    }

    @Override
    public Call getCall() {
        return new CalLIOS();
    }

    @Override
    public WiFi getWiFi() {
        return new WiFiIOS();
    }
}

package basepattern.chaplinskiy.creational.abstractFactory;

import basepattern.chaplinskiy.creational.abstractFactory.ios.SmartphoneFactoryIOS;

public class IOsDevice {
    public static void main(String[] args) {
        SmartphoneFactory smartphoneFactoryIOS = new SmartphoneFactoryIOS();
        Call call = smartphoneFactoryIOS.getCall();
        Message message = smartphoneFactoryIOS.getMessage();
        WiFi wiFi = smartphoneFactoryIOS.getWiFi();

        System.out.println("IOS device");

        call.calling();
        message.sendMessage();
        wiFi.activeWiFi();
    }
}

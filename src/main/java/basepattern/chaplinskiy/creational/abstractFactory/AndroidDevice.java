package basepattern.chaplinskiy.creational.abstractFactory;

import basepattern.chaplinskiy.creational.abstractFactory.android.SmartphoneFactoryAndroid;

public class AndroidDevice {
    public static void main(String[] args) {
        SmartphoneFactory smartphoneFactory = new SmartphoneFactoryAndroid();
        Call call = smartphoneFactory.getCall();
        Message message = smartphoneFactory.getMessage();
        WiFi wiFi = smartphoneFactory.getWiFi();

        System.out.println("Android device");

        call.calling();
        message.sendMessage();
        wiFi.activeWiFi();
    }

}

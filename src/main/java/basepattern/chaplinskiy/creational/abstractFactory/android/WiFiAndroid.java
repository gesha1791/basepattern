package basepattern.chaplinskiy.creational.abstractFactory.android;

import basepattern.chaplinskiy.creational.abstractFactory.WiFi;

public class WiFiAndroid implements WiFi {
    @Override
    public void activeWiFi() {
        System.out.println("Activate wifi on your android device");
    }
}

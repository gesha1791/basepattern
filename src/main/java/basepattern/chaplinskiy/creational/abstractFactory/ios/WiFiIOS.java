package basepattern.chaplinskiy.creational.abstractFactory.ios;

import basepattern.chaplinskiy.creational.abstractFactory.WiFi;

public class WiFiIOS implements WiFi {
    @Override
    public void activeWiFi() {
        System.out.println("Activate wifi on your ios device");
    }
}

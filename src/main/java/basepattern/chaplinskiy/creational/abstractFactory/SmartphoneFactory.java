package basepattern.chaplinskiy.creational.abstractFactory;

public interface SmartphoneFactory {
    Message getMessage();
    Call getCall();
    WiFi getWiFi();
}

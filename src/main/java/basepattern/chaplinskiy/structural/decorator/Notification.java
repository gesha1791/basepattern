package basepattern.chaplinskiy.structural.decorator;

public class Notification {
    public static void main(String[] args) {
        Message notification = new EmailNotification(new TelephoneNotification(new SMSNotification()));
        System.out.println(notification.sendMessage());
    }
}

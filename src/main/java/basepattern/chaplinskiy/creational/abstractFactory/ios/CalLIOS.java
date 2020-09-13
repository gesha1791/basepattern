package basepattern.chaplinskiy.creational.abstractFactory.ios;

import basepattern.chaplinskiy.creational.abstractFactory.Call;

public class CalLIOS implements Call {
    @Override
    public void calling() {
        System.out.println("Calling to client from IOS");
    }
}

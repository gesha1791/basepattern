package basepattern.chaplinskiy.creational.abstractFactory.android;

import basepattern.chaplinskiy.creational.abstractFactory.Call;

public class CallAndroid implements Call {
    @Override
    public void calling() {
        System.out.println("Callinf to client from Android");
    }
}

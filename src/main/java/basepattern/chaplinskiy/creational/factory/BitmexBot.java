package basepattern.chaplinskiy.creational.factory;

public class BitmexBot implements Bot {
    @Override
    public void trade() {
        System.out.println("Begin trading on Bitmex exchange");
    }
}

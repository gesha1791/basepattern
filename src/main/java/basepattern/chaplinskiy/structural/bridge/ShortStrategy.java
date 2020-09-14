package basepattern.chaplinskiy.structural.bridge;

public class ShortStrategy implements Strategy {
    @Override
    public void trading() {
        System.out.println("Trading short deals");
    }
}

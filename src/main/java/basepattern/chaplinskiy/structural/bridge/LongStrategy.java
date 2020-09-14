package basepattern.chaplinskiy.structural.bridge;

public class LongStrategy implements Strategy {
    @Override
    public void trading() {
        System.out.println("Trading long deals");
    }
}

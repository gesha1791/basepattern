package basepattern.chaplinskiy.behavioral.strategy;

public class ReadNews implements Phase {
    @Override
    public void execute() {
        System.out.println("Reading stock news");
    }
}

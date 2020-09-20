package basepattern.chaplinskiy.behavioral.state;

public class ReadNews implements Phase {
    @Override
    public void execute() {
        System.out.println("Reading stock news");
    }
}

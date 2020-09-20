package basepattern.chaplinskiy.behavioral.chainOfResponsibility;

public class OperatorQuestion extends Question {
    public OperatorQuestion(int priority) {
        super(priority);
    }

    @Override
    protected void execute(String message) {
        System.out.println("Decision your problem");
    }
}

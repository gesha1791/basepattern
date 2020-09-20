package basepattern.chaplinskiy.behavioral.chainOfResponsibility;

public class GeneralQuestion extends Question {
    public GeneralQuestion(int priority) {
        super(priority);
    }

    @Override
    protected void execute(String message) {
        System.out.println("Ask general question");
    }
}

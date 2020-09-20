package basepattern.chaplinskiy.behavioral.chainOfResponsibility;

public class RegistrationQuestion extends Question {
    public RegistrationQuestion(int priority) {
        super(priority);
    }

    @Override
    protected void execute(String message) {
        System.out.println("Did you want to register? " + message);
    }
}

package basepattern.chaplinskiy.behavioral.chainOfResponsibility;

public abstract class Question {
    private int priority;
    private Question nextQuestion;

    public Question(int priority) {
        this.priority = priority;
    }

    public void setNextQuestion(Question nextQuestion) {
        this.nextQuestion = nextQuestion;
    }

    public void questionManager(String message, int level){
        if (level == priority){
            execute(message);
        }

        if (nextQuestion != null){
            nextQuestion.questionManager(message, level);
        }
    }

    protected abstract void execute(String message);
}

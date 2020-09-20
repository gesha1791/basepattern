package basepattern.chaplinskiy.behavioral.chainOfResponsibility;

import basepattern.suleymanov.behavioral.chainOfResponsibility.Priority;

public class Support {
    public static void main(String[] args) {
        Question registrationQuestion = new RegistrationQuestion(QuestionPriority.REGISTRATION);
        Question generalQuestion = new GeneralQuestion(QuestionPriority.GENERALQUESTION);
        Question operatorQuestion = new OperatorQuestion(QuestionPriority.CALLOPERATOR);

        registrationQuestion.setNextQuestion(generalQuestion);
        generalQuestion.setNextQuestion(operatorQuestion);

        registrationQuestion.questionManager("Register Question", QuestionPriority.REGISTRATION);
        registrationQuestion.questionManager("General Question", QuestionPriority.GENERALQUESTION);
        registrationQuestion.questionManager("Operator Question", QuestionPriority.CALLOPERATOR);
    }
}

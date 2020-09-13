package basepattern.suleymanov.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpretet("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpretet("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TermionalExpression("Java");
        Expression javaCore = new TermionalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TermionalExpression("Java");
        Expression spring = new TermionalExpression("Spring");

        return new AndExpression(java, spring);
    }
}

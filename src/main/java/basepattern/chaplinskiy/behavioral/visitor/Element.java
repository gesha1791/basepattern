package basepattern.chaplinskiy.behavioral.visitor;

public abstract class Element {
    public String example;

    public Element(String example) {
        this.example = example;
    }

    public abstract void accept(Visitor v);
}

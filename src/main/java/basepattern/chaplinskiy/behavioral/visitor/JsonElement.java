package basepattern.chaplinskiy.behavioral.visitor;

public class JsonElement extends Element {
    public JsonElement(String example) {
        super(example);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

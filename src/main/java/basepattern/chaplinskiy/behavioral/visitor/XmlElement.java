package basepattern.chaplinskiy.behavioral.visitor;

public class XmlElement extends Element {
    public XmlElement(String example) {
        super(example);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

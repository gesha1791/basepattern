package basepattern.chaplinskiy.behavioral.visitor;

public interface Visitor {
    void visit(XmlElement xmlElement);
    void visit(JsonElement jsonElement);
}

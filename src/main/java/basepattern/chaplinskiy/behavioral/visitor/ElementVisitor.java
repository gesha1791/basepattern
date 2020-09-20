package basepattern.chaplinskiy.behavioral.visitor;

public class ElementVisitor implements Visitor {
    @Override
    public void visit(XmlElement xmlElement) {
        System.out.println("xml element : " + xmlElement.example);

    }

    @Override
    public void visit(JsonElement jsonElement) {
        System.out.println("json element : " + jsonElement.example);

    }
}

package basepattern.chaplinskiy.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ElementVisitor elementVisitor = new ElementVisitor();

        Document document = new Document("123");
        document.elements.add(new JsonElement("12334324"));
        document.elements.add(new XmlElement("jkhkjg4735"));
        document.elements.add(new XmlElement("sdf345"));

        document.accept(elementVisitor);
    }
}

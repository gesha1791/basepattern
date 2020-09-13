package basepattern.suleymanov.structural.bridge;


public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange system development");
        developer.writeCode();
    }
}

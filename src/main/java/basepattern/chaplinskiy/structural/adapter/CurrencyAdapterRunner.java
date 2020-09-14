package basepattern.chaplinskiy.structural.adapter;

public class CurrencyAdapterRunner {
    public static void main(String[] args) {
        PrintText adapterEvroPrintText = new AdapterPrintText();

        adapterEvroPrintText.print();
    }
}

package basepattern.chaplinskiy.structural.adapter;

public class AdapterPrintText extends DollarApplication implements PrintText {

    @Override
    public void print() {
        getDollarPrice();
    }
}

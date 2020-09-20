package basepattern.chaplinskiy.structural.proxy;

public class RealBot implements Bot {
    private String excahngeName;

    public RealBot(String excahngeName) {
        this.excahngeName = excahngeName;
        analyzeTrade(excahngeName);
    }

    private void analyzeTrade(String excahngeName) {
        System.out.println("Analyze trades on exchange " + excahngeName + "...");
    }

    @Override
    public void run() {
        System.out.println("Running bot on exchange " + excahngeName + "...");
    }
}

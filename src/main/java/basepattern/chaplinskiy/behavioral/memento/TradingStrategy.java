package basepattern.chaplinskiy.behavioral.memento;

import basepattern.suleymanov.behavioral.memento.Save;

import java.util.Date;

public class TradingStrategy {
    private String version;
    private Date date;

    public void setDateAndVersion(String version){
        this.version = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(version);
    }

    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Trading strategy:\n" +
                "\nVersion: '" + version +
                "\nDate: " + date + "\n";
    }
}

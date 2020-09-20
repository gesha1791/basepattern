package basepattern.chaplinskiy.behavioral.memento;

import basepattern.suleymanov.behavioral.memento.Save;

public class CsvData {
    private basepattern.suleymanov.behavioral.memento.Save save;

    public basepattern.suleymanov.behavioral.memento.Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}

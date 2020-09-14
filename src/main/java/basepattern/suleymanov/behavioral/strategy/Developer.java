package basepattern.suleymanov.behavioral.strategy;

import basepattern.suleymanov.behavioral.state.Activity;

public class Developer {
    basepattern.suleymanov.behavioral.state.Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}

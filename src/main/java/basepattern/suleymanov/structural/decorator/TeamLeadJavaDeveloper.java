package basepattern.suleymanov.structural.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecorator {

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String sendReport(){
        return "send reports to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + ", " + sendReport();
    }
}

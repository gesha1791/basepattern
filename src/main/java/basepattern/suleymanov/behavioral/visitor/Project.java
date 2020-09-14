package basepattern.suleymanov.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project(){
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement p : projectElements){
            p.beWritten(developer);
        }
    }
}

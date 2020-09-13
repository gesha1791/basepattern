package basepattern.suleymanov.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project realProject = new ProxyProject("www.github.com/proselyte/realProject");

        realProject.run();


    }
}

package basepattern.suleymanov.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setDateAndVersion("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version");
        github.setSave(project.save());

        System.out.println("Updating project to version 1.1");

        System.out.println("Writing poor code");

        Thread.sleep(5000);

        project.setDateAndVersion("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        System.out.println("Rolling back to version 1.0");

        project.load(github.getSave());
        System.out.println("Project after rollback");

        System.out.println(project);
    }
}

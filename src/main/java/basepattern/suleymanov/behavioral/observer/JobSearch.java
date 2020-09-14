package basepattern.suleymanov.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Observer firstSubscriber = new Subscriber("Eugene");
        Observer secongSubscriber = new Subscriber("Peter");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secongSubscriber);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("First java position");
    }
}

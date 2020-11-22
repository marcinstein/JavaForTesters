public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Description 1", "submitter1@email.com", 1);
        Bug bug2 = new Bug("Description 2", "submitter2@email.com", 5);

        bug1.showAllBugInfo();

        bug2.showBugStatus();
        bug2.showSubmitter();
        bug2.showBugPriority();

        bug1.setBugToClosed();
        bug1.showAllBugInfo();
    }
}

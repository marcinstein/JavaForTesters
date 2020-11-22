import model.Bug;

public class MainApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Description 1", "submitter1@email.com", 1);

        bug.showAllBugInfo();

        bug.showSubmitter();
        bug.showBugPriority();
        bug.setBugToClosed();
        bug.showBugStatus();
        bug.setBugToOpen();
        bug.showBugStatus();
        bug.setBugDescription("Too short");
        bug.setSubmitterEmail("EmailWithoutAtSign");
        bug.setSubmitterEmail("EmailWithDouble@@sign");
        bug.setBugPriority(0);
        bug.setBugPriority(6);
        bug.setBugPriority(1);
        bug.showBugPriority();
        bug.setBugPriority(5);
        bug.showBugPriority();
    }
}

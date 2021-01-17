import model.bug.Bug;
import model.bug.BugReporter;

public class MainApp {
    public static void main(String[] args) {

        Bug bug = new Bug("Bug description123", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4);

        bug.showAllBugInfo();
        bug.setBugToClosed();
        bug.showAllBugInfo();
    }
}

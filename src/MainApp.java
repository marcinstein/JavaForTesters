import model.bug.Bug;
import model.bug.BugReporter;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug("10 Bug 10", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4));
        bugs.add(new Bug("4 Bug 4", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4));
        bugs.add(new Bug("20 Bug 20", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4));
        bugs.add(new Bug("Bug duplicate", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4));
        bugs.add(new Bug("Bug duplicate", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4));
        bugs.add(new Bug("5 Bug 5", new BugReporter("Marcin", "Testowy", "marcin@test.com"), 4));

        Set<Bug> uniqueBugs = new HashSet<>(bugs);

        Set<Bug> sortedUniqueBugs = new TreeSet<>(uniqueBugs);

        for (Bug bug : sortedUniqueBugs
        ) {
            System.out.println("----------");
            bug.showAllBugInfo();
        }
        System.out.println("----------");
    }
}

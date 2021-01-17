package model.bug;

public class Bug implements ConsoleNotification {
    private String bugDescription;
    private int bugPriority;
    private boolean isOpened;
    private BugReporter bugReporter;


    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.isOpened = true;
    }

    public void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + "\n" +
                "Bug reporter: " + bugReporter.getEmail() + "\t" + bugReporter.getFirstName() + " " +
                bugReporter.getLastName() + "\n" +
                "Bug priority: " + bugPriority + "\n" +
                "Bug status: " + setBugStatusText());
    }

    public void showSubmitter() {
        System.out.println("Submitter email: " + bugReporter);
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + setBugStatusText());
    }

    public void showBugPriority() {
        System.out.println("Bug Priority: " + bugPriority);
    }

    private String setBugStatusText() {
        if (isOpened) {
            return "Opened";
        } else {
            return "Closed";
        }
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Bug description has not been changed. Bug description must be at least 10 characters long");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if ((bugPriority < 1) || (bugPriority > 5)) {
            System.out.println("Bug priority must be in range 1-5");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public void setBugToClosed() {
        this.isOpened = false;
        notifyStatusChange();
    }

    public void setBugToOpen() {
        this.isOpened = true;
        notifyStatusChange();
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("\n" + "BUG STATUS HAS CHANGED" + "\n");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", isOpened=" + isOpened +
                ", bugReporter=" + bugReporter +
                '}';
    }
}

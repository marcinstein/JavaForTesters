public class Bug {

    String bugDescription;
    String submitterEmail;
    int bugPriority;
    boolean isOpened;


    public Bug(String bugDescription, String submitterEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.submitterEmail = submitterEmail;
        this.bugPriority = bugPriority;
        this.isOpened = true;
    }

    void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + "\n" +
                "Submitter email: " + submitterEmail + "\n" +
                "Bug priority: " + bugPriority + "\n" +
                "Bug status: " + setBugStatusText());
    }

    void showSubmitter() {
        System.out.println("Submitter email: " + submitterEmail);
    }

    void showBugStatus() {
        System.out.println("Bug status: " + setBugStatusText());
    }

    void showBugPriority() {
        System.out.println("Bug Priority: " + bugPriority);
    }

    String setBugStatusText() {
        if (isOpened) {
            return "Opened";
        } else {
            return "Closed";
        }
    }

    void setBugToClosed() {
        this.isOpened = false;
    }
}

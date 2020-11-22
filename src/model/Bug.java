package model;

public class Bug {

    private String bugDescription;
    private String submitterEmail;
    private int bugPriority;
    private boolean isOpened;


    public Bug(String bugDescription, String submitterEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.submitterEmail = submitterEmail;
        this.bugPriority = bugPriority;
        this.isOpened = true;
    }

    public void showAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + "\n" +
                "Submitter email: " + submitterEmail + "\n" +
                "Bug priority: " + bugPriority + "\n" +
                "Bug status: " + setBugStatusText());
    }

    public void showSubmitter() {
        System.out.println("Submitter email: " + submitterEmail);
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

    public String getSubmitterEmail() {
        return submitterEmail;
    }

    public void setSubmitterEmail(String submitterEmail) {
        long count = submitterEmail.chars().filter(ch -> ch =='@').count();
        if (count != 1){
            System.out.println("Email address is invalid. Email address has not been changed");
        } else {
            this.submitterEmail = submitterEmail;
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        if ((bugPriority<1) || (bugPriority>5)){
            System.out.println("Bug priority must be in range 1-5");
        } else{
            this.bugPriority = bugPriority;
        }
    }

    public void setBugToClosed() {
        this.isOpened = false;
    }

    public void setBugToOpen() {
        this.isOpened = true;
    }
}
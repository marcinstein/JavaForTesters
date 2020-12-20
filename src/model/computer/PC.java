package model.computer;

public class PC extends Computer {

    private boolean isPowerEnabled;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerEnabled = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerEnabled) {
            super.switchOn();
        } else {
            System.out.println("Power cable not plugged in");
        }
    }

    public void setPowerEnabled(boolean powerEnabled) {
        isPowerEnabled = powerEnabled;
    }
}
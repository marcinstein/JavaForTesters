package model.computer;

public class PC extends Computer {

    private boolean isPowerEnabled;

    public PC(String name, String type, Hdd hdd, Ram ram) {
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

    @Override
    public void switchOff() {
        state = false;
        System.out.println("Switching off PC: " + name);
    }

    public void setPowerEnabled(boolean powerEnabled) {
        isPowerEnabled = powerEnabled;
    }

    @Override
    public int volumeUp() {
        volumeLevel += 1;
        if (volumeLevel > 100) {
            volumeLevel = MAX_VOLUME;
        }
        System.out.println("Increase \"" + name + "\" volume level by 1");
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel < 0) {
            volumeLevel = MIN_VOLUME;
        }
        System.out.println("Decrease \"" + name + "\" volume level by 1");
        return volumeLevel;
    }

    @Override
    public int volumeUp(int i) {
        volumeLevel += i;
        if (volumeLevel > 100) {
            volumeLevel = MAX_VOLUME;
        }
        System.out.println("Increase \"" + name + "\" volume level by " + i);
        return volumeLevel;
    }

    @Override
    public int volumeDown(int i) {
        volumeLevel -= i;
        if (volumeLevel < 0) {
            volumeLevel = MIN_VOLUME;
        }
        System.out.println("Decrease \"" + name + "\" volume level by " + i);
        return volumeLevel;
    }
}
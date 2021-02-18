package model.computer;

public class Laptop extends Computer implements Music, Video{

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low");
        }
    }

    @Override
    public void switchOff() {
        state = false;
        System.out.println("Switching off laptop: " + name);
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public int volumeUp() {
        volumeLevel += 5;
        if (volumeLevel > 100) {
            volumeLevel = MAX_VOLUME;
        }
        System.out.println("Increase \"" + name + "\" volume level by 5");
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel < 0) {
            volumeLevel = MIN_VOLUME;
        }
        System.out.println("Decrease \"" + name + "\" volume level by 2");
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

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO");
    }
}

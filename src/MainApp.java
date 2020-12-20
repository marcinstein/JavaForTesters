import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office Computer 1", "HP", 500, 128);
        Computer gamingLaptop1 = new Laptop("XGames 1", "HP Games", 500, 256, 50);


        officeComputer1.getVolumeLevel();
        officeComputer1.volumeUp();
        officeComputer1.getVolumeLevel();
        officeComputer1.volumeUp(22);
        officeComputer1.getVolumeLevel();
        officeComputer1.volumeUp(122);
        officeComputer1.getVolumeLevel();
        officeComputer1.volumeUp();
        officeComputer1.getVolumeLevel();
        officeComputer1.volumeDown();
        officeComputer1.getVolumeLevel();
        officeComputer1.volumeDown(101);
        officeComputer1.getVolumeLevel();
        officeComputer1.volumeDown();
        officeComputer1.getVolumeLevel();

        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeUp();
        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeUp(9);
        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeUp(244);
        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeUp();
        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeDown();
        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeDown(155);
        gamingLaptop1.getVolumeLevel();
        gamingLaptop1.volumeDown();
        gamingLaptop1.getVolumeLevel();
    }
}

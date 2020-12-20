import model.computer.Laptop;
import model.computer.PC;

public class MainApp {
    public static void main(String[] args) {

        PC officeComputer = new PC("Office Computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256, 50);

        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.setPowerEnabled(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
    }
}

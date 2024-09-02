import Models.Device;
import Models.DigitalRadio;
import Models.TV;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV(true);
        Device radio = new DigitalRadio("FM");

        testDevice(tv);
        testDevice(radio);
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
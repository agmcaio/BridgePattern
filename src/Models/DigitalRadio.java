package Models;

public class DigitalRadio extends Device {
    private String modulation;

    public DigitalRadio(String modulation) {
        this.modulation = modulation;
    }

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a Digital Radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("| Modulation is set to " + modulation);
        System.out.println("------------------------------------\n");
    }
}

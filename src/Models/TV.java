package Models;

public class TV extends Device {
    private boolean smart;

    public TV(boolean smart) {
        this.smart = smart;
    }

    public boolean isSmartOn() {
        return smart;
    }

    public void smartOn() {
        smart = true;
    }

    public void smartOff() {
        smart = false;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a TV.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("| Smart TV mode is " + (smart ? "on" : "off"));
        System.out.println("------------------------------------\n");
    }
}

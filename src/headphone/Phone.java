package headphone;

import java.util.List;

public class Phone {
    private final List<WiredHeadphones> wiredHeadphones;
    private final List<WirelessHeadphones> wirelessHeadphones;

    public Phone(List<WiredHeadphones> wiredHeadphones, List<WirelessHeadphones> wirelessHeadphones) {
        this.wiredHeadphones = wiredHeadphones;
        this.wirelessHeadphones = wirelessHeadphones;
    }

    public List<WiredHeadphones> getWiredHeadphones() {
        return wiredHeadphones;
    }

    public List<WirelessHeadphones> getWirelessHeadphones() {
        return wirelessHeadphones;
    }

    public void connect(Headphones headphone) {
        String type = headphone.getManufacturer();
        String model = headphone.getModel();
        System.out.println(type + " " + model + " headphones connected.");
    }

    public void disconnect(Headphones headphone) {
        System.out.println(headphone.getManufacturer() + " " + headphone.getModel() + " headphones disconnected.");
    }
}

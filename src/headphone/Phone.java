package headphone;

import java.util.List;

public class Phone {
    static class WiredHeadphones extends Headphones {
        public WiredHeadphones(String manufacturer, String model) {
            super(manufacturer, model);
        }
        public void print() {
            System.out.println("Wired Headphones");
        }
    }

    static class WirelessHeadphones extends Headphones{
        public WirelessHeadphones(String manufacturer, String model) {
            super(manufacturer, model);
        }
        public void print() {
            System.out.println("Wireless Headphones");
        }
    }
    /*
    public Phone(List<WiredHeadphones> wiredHeadphones, List<WirelessHeadphones> wirelessHeadphones) {

    }*/
/*
    public List<WiredHeadphones> getWiredHeadphones() {
        return wiredHeadphones;
    }

    public List<WirelessHeadphones> getWirelessHeadphones() {
        return wirelessHeadphones;
    }*/

    public static void connect(Headphones headphone) {
        String type = headphone.getManufacturer();
        String model = headphone.getModel();
        System.out.println(type + " " + model + " headphones connected.");

    }

    public static void disconnect(Headphones headphone) {
        System.out.println(headphone.getManufacturer() + " " + headphone.getModel() + " headphones disconnected.");
    }
}

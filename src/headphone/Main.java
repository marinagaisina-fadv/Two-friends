package headphone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WirelessHeadphones wirelessHeadphone1 = new WirelessHeadphones("iPhone", "wireless");
        WiredHeadphones wiredHeadphone1 = new WiredHeadphones("iPhone", "wired");
        WirelessHeadphones wirelessHeadphone2 = new WirelessHeadphones("Samsung", "wireless");
        WiredHeadphones wiredHeadphone2 = new WiredHeadphones("Samsung", "wired");
        WirelessHeadphones wirelessHeadphone3 = new WirelessHeadphones("Sony", "wireless");
        WiredHeadphones wiredHeadphone3 = new WiredHeadphones("Sony", "wired");

        Phone phone = new Phone(Arrays.asList(wiredHeadphone1, wiredHeadphone2, wiredHeadphone3),
                Arrays.asList(wirelessHeadphone1, wirelessHeadphone2, wirelessHeadphone3));

        phone.connect(wirelessHeadphone3);
        phone.disconnect(wirelessHeadphone3);
        phone.connect(wiredHeadphone2);
        phone.disconnect(wiredHeadphone2);
    }
}

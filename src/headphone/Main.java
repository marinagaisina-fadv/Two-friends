package headphone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone.WiredHeadphones wiredHeadphones1 = new Phone.WiredHeadphones("Sony", "wired");
        Phone.WiredHeadphones wiredHeadphones2 = new Phone.WiredHeadphones("Sumsung", "wired");
        Phone.WirelessHeadphones wirelessHeadphones1 = new Phone.WirelessHeadphones("iPhone", "wireless");
        Phone.WirelessHeadphones wirelessHeadphones2 = new Phone.WirelessHeadphones("Bose", "wireless");
        Phone.connect(wiredHeadphones1);
        Phone.disconnect(wiredHeadphones1);
        Phone.connect(wirelessHeadphones2);
        Phone.disconnect(wirelessHeadphones2);
    }
}

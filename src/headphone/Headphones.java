package headphone;

public abstract class Headphones {
    private final String manufacturer;
    private final String model;

    public Headphones(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}

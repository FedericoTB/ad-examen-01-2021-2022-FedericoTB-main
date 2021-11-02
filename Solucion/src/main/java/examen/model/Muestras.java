package examen.model;

public class Muestras {
    private String identifier;
    private String modified;
    private String type;
    private String temperature;
    private String noise;
    private String light;
    private String batteryCharge;

    public Muestras(String childText, String text, String elemChildText, String s, String childText1, String text1, String elemChildText1, String s1) {
    }

    public Muestras(String identifier, String modified, String type, String temperature, String noise, String light, String batteryCharge) {
        this.identifier = identifier;
        this.modified = modified;
        this.type = type;
        this.temperature = temperature;
        this.noise = noise;
        this.light = light;
        this.batteryCharge = batteryCharge;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(String batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    public String toString() {
        return "Muestras{" +
                "identifier='" + identifier + '\'' +
                ", modified='" + modified + '\'' +
                ", type='" + type + '\'' +
                ", temperature='" + temperature + '\'' +
                ", noise='" + noise + '\'' +
                ", light='" + light + '\'' +
                ", batteryCharge='" + batteryCharge + '\'' +
                '}';
    }
}

package RMIWeatherClientServer;

/**
 * Created by Empyreans on 29.10.2017.
 */
public class WeatherData {
    private String time;
    private String celsius;
    private boolean updated = false;

    public WeatherData(String time, String celsius){
        this.time = time;
        this.celsius = celsius;
    }

    public void setUpdated(boolean b){
        updated = b;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    public boolean isUpdated() {
        return updated;
    }

    public String getTime() {
        return time;
    }

    public String getCelsius() {
        return celsius;
    }
}
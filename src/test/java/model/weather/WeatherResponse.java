package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    private double lat;
    private double lon;
    private String timezone;

    @JsonProperty ("timezone_offset")
    private int timezoneOffset;

    private CurrentHourlyDetails current;

    //HW
    //private Minutely minutely;
    @JsonProperty("minutely")
    private List<Minutely> minutelys;
    private List<CurrentHourlyDetails> hourly;
    private Daily daily;
    private Alerts alerts;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public CurrentHourlyDetails getCurrent() {
        return current;
    }

    public void setCurrent(CurrentHourlyDetails current) {
        this.current = current;
    }

    public List<Minutely> getMinutelys() {
        return minutelys;
    }

    public void setMinutelys(List<Minutely> minutelys) {
        this.minutelys = minutelys;
    }

    public List<CurrentHourlyDetails> getHourly() {
        return hourly;
    }

    public void setHourly(List<CurrentHourlyDetails> hourly) {
        this.hourly = hourly;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }
}

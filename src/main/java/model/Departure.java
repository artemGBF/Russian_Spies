package model;

public class Departure {
    private String City;
    private String Airport;
    private String Country;

    public Departure(String city, String airport, String country) {
        City = city;
        Airport = airport;
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAirport() {
        return Airport;
    }

    public void setAirport(String airport) {
        Airport = airport;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "0_"+City+"_"+Airport+"_"+Country;
    }
}

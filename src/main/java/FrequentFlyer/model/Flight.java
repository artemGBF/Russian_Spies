package FrequentFlyer.model;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Flight {
    private String Date;
    private String Codeshare;
    private Arrival Arrival;
    private String Flight;
    private Departure Departure;

    public Flight(String date, String codeshare, FrequentFlyer.model.Arrival arrival, String flight, FrequentFlyer.model.Departure departure) {
        Date = date;
        Codeshare = codeshare;
        Arrival = arrival;
        Flight = flight;
        Departure = departure;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCodeshare() {
        return Codeshare;
    }

    public void setCodeshare(String codeshare) {
        Codeshare = codeshare;
    }

    public FrequentFlyer.model.Arrival getArrival() {
        return Arrival;
    }

    public void setArrival(FrequentFlyer.model.Arrival arrival) {
        Arrival = arrival;
    }

    public String getFlight() {
        return Flight;
    }

    public void setFlight(String flight) {
        Flight = flight;
    }

    public FrequentFlyer.model.Departure getDeparture() {
        return Departure;
    }

    public void setDeparture(FrequentFlyer.model.Departure departure) {
        Departure = departure;
    }

    public static Flight fromJson(String fileName) throws FileNotFoundException {
        return new Gson().fromJson(new JsonReader(new FileReader(fileName)), Flight.class);
    }

    @Override
    public String toString() {
        return Date + "_" + Codeshare + "1_" + Arrival.getCity() + "_" + Arrival.getAirport() + "_" + Arrival.getCountry()
                + "_" + Flight + "2_" + Departure.getCity() + "_" + Departure.getAirport() + "_" + Departure.getCountry();
    }
}

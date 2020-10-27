package model;


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

    public Flight(String date, String codeshare, model.Arrival arrival, String flight, model.Departure departure) {
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

    public model.Arrival getArrival() {
        return Arrival;
    }

    public void setArrival(model.Arrival arrival) {
        Arrival = arrival;
    }

    public String getFlight() {
        return Flight;
    }

    public void setFlight(String flight) {
        Flight = flight;
    }

    public model.Departure getDeparture() {
        return Departure;
    }

    public void setDeparture(model.Departure departure) {
        Departure = departure;
    }

    public static Flight fromJson(String fileName) throws FileNotFoundException {
        return new Gson().fromJson(new JsonReader(new FileReader(fileName)), Flight.class);
    }

    @Override
    public String toString() {
        return Date+"|"+Codeshare+"|"+Arrival+"|"+Flight+"|"+Departure;
    }
}

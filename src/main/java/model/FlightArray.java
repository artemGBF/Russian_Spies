package model;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class FlightArray {
    private Flight[] mass;

    public FlightArray(String regFlights, Flight[] mass) {
        this.mass = mass;
    }

    public Flight[] getMass() {
        return mass;
    }

    public void setMass(Flight[] mass) {
        this.mass = mass;
    }

    public static FlightArray fromJson(String fileName) throws FileNotFoundException {
        return new Gson().fromJson(new JsonReader(new FileReader(fileName)), FlightArray.class);
    }

    @Override
    public String toString() {
       String s = "";
        for (int i = 0; i < mass.length; i++) {
            s+=mass[i].toString()+"<>";
        }
        return s;
    }
}

package model;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoardingData {
    private String firstName;
    private String secondName;
    private String lastName;
    private String sex;
    private String birthDay;
    private String document;
    private String bookingCode;
    private String ticketNumber;
    private String baggage;
    private String flightDate;
    private String flightNumber;
    private String codeShare;
    private String destination;

    public BoardingData() {
    }

    public BoardingData(String firstName, String secondName, String lastName, String sex, String birthDay, String document, String bookingCode, String ticketNumber, String baggage, String flightDate, String flightNumber, String codeShare, String destination) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.document = document;
        this.bookingCode = bookingCode;
        this.ticketNumber = ticketNumber;
        this.baggage = baggage;
        this.flightDate = flightDate;
        this.flightNumber = flightNumber;
        this.codeShare = codeShare;
        this.destination = destination;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCodeShare() {
        return codeShare;
    }

    public void setCodeShare(String codeShare) {
        this.codeShare = codeShare;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public static ArrayList<BoardingData> read(String fileName) throws IOException {
        ArrayList<BoardingData> list = new ArrayList<BoardingData>();
        FileInputStream f = new FileInputStream(fileName);
        byte[] mass = new byte[f.available()];
        f.read(mass);
        String content = new String(mass);
        String[] split = content.split("\r\n");
        for (int i = 2; i < split.length; i++) {
            String[] split1 = split[i].split(";");
            list.add(new BoardingData(split1[0], split1[1], split1[2], split1[3], split1[4], split1[5], split1[6],
                    split1[7], split1[8], split1[9], split1[10], split1[11], split1[12]));
        }
        return list;
    }

    public static String convertToXML(ArrayList<BoardingData> list) throws ParserConfigurationException {
        XStream stream = new XStream();
        stream.alias("Passenger", BoardingData.class);
        stream.alias("Info", List.class);
        return stream.toXML(list);
    }

    public static String convertToJson(ArrayList<BoardingData> list){
        return new Gson().toJson(list);
    }
}

package program;

import AirlinesData.PointzAggregatorUsers;
import FrequentFlyer.FrequentFlyerForum;
import FrequentFlyer.model.ForumProfiles;
import model.BoardingData;
import model.Flight;
import model.FlightArray;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        /*try {
            String s = BoardingData.convertToXML(BoardingData.read("BoardingData.csv"));
            FileOutputStream outputStream = new FileOutputStream("neo.xml");
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }*/

       /* try {
            FlightArray flight = FlightArray.fromJson("JsonTest.json");
            System.out.println(flight);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


        PointzAggregatorUsers parse = PointzAggregatorUsers.parse("testXML.xml");
        System.out.println(parse);
        parse.write();

       /* FileInputStream f = new FileInputStream("FrequentFlyerForum-Profiles.json");
        byte[] b = new byte[f.available()];
        f.read(b);
        ForumProfiles forumProfiles = ForumProfiles.fromJson(b);
        System.out.println(forumProfiles.toString());*/
    }

}

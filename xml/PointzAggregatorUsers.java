package AirlinesData;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.*;

@XStreamAlias(value = "PointzAggregatorUsers")
public class PointzAggregatorUsers {
    @XStreamImplicit(itemFieldName = "user")
    @XStreamAlias(value = "users")
    private User[] users;

    public static PointzAggregatorUsers parse(String fileName) throws FileNotFoundException {
        XStream stream = new XStream();
        stream.alias("PointzAggregatorUsers", PointzAggregatorUsers.class);
        stream.autodetectAnnotations(true);
        return (PointzAggregatorUsers) stream.fromXML(new InputStreamReader(new FileInputStream(fileName)));
    }

    public void write() throws IOException {
        XStream stream = new XStream();
        stream.alias("PointzAggregatorUsers", PointzAggregatorUsers.class);
        stream.autodetectAnnotations(true);
        stream.toXML(this, new FileWriter("new.csv"));
    }

    @Override
    public String toString() {
        String s ="";
        for (int i = 0; i < users.length; i++) {
            s+=users[i]+"\n";
        }
        return s;
    }
}

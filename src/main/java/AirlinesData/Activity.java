package AirlinesData;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias(value = "activity")
public class Activity {
    @XStreamAsAttribute
    private String type;
    private String Code;
    private String Date;
    private String Departure;
    private String Arrival;
    private String Fare;

    @Override
    public String toString() {
        return type + "_" + Code + "_" + Date + "_" + Departure + "_" + Arrival + "_" + Fare;
    }
}

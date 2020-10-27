package AirlinesData;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias(value = "card")
public class Card {
    private class Activities{
        @XStreamImplicit(itemFieldName = "activity")
        private Activity[] activities;
        @XStreamAsAttribute
        private String type;
    }
    @XStreamAsAttribute
    private String number;
    private String bonusprogramm;
    private Activities activities;

    @Override
    public String toString() {
        String s =number+"^"+bonusprogramm;
        if(activities.activities!=null) {
            s+="_"+activities.type+"|";
            for (int i = 0; i < activities.activities.length; i++) {
                if(i!=activities.activities.length-1) {
                    s += activities.activities[i] + "|";
                }
                else{
                    s += activities.activities[i];
                }
            }
        }
        return s;
    }
}

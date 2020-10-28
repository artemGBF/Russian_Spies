package AirlinesData;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias(value = "user")
public class User {
    @XStreamAlias(value = "name")
    private class Name{
        @XStreamAsAttribute
        private String first;
        @XStreamAsAttribute
        private String last;
    }

    @XStreamAlias(value = "cards")
    private class Cards{
        @XStreamImplicit(itemFieldName = "card")
        private Card[] cards;
        @XStreamAsAttribute
        private String type;
    }
    @XStreamAsAttribute
    private String uid;
    private Name name;
    private Cards cards;

    @Override
    public String toString() {
        String s =uid+";"+name.first+";"+name.last+";";
        if(cards.cards!=null) {
            for (int i = 0; i <cards.cards.length; i++) {
                if(i!=cards.cards.length-1) {
                    s += cards.cards[i] + "!";
                }
                else{
                    s += cards.cards[i];
                }
            }
        }
        return s;

    }
}

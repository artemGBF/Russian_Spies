package FrequentFlyer.model;

import com.google.gson.annotations.SerializedName;

public class RealName {
    @SerializedName(value = "Last_Name", alternate = "Last Name")
    private String Last_name;
    @SerializedName(value = "First_Name", alternate = "First Name")
    private String First_Name;

    public RealName(String last_name, String first_Name) {
        Last_name = last_name;
        First_Name = first_Name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    @Override
    public String toString() {
        return Last_name+"/"+First_Name;
    }
}

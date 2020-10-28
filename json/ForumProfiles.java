package FrequentFlyer.model;

import FrequentFlyer.FrequentFlyerForum;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.io.*;

public class ForumProfiles {
    @SerializedName(value = "mass", alternate = "Forum Profiles")
    FrequentFlyerForum[] mass;

    public ForumProfiles() {
    }

    public static ForumProfiles fromJson(byte[] arr) throws FileNotFoundException {
        return new Gson().fromJson(new String(arr),ForumProfiles.class);
    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < mass.length; i++) {
            s+=mass[i]+"\n";
        }
        return s;
    }
}

package FrequentFlyer.model;

public class Document {
    private String Passports;

    public Document(String passports) {
        Passports = passports;
    }

    public String getPassports() {
        return Passports;
    }

    public void setPassports(String passports) {
        Passports = passports;
    }

    @Override
    public String toString() {
        return Passports;
    }
}

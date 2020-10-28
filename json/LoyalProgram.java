package FrequentFlyer.model;

public class LoyalProgram {
    private String Status;
    private String programm;
    private String Number;

    public LoyalProgram(String status, String programm, String number) {
        Status = status;
        this.programm = programm;
        Number = number;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getProgramm() {
        return programm;
    }

    public void setProgramm(String programm) {
        this.programm = programm;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        return Status+";"+programm+";"+Number+"\n";
    }
}

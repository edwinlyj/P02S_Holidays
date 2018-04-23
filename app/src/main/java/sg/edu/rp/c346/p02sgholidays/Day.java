package sg.edu.rp.c346.p02sgholidays;

public class Day {
    private String name;
    private String Date;

    public Day(String name, String date) {
        this.name = name;
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

}

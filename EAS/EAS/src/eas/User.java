package eas;

import java.time.Month;

public class User {

    private String std_id;
    private String date;
    private String month;
    private String year;
    private String time;
    private String status;

    public User(String std_id, String date, String month, String year, String time, String status) {
        this.std_id = std_id;
        this.date = date;
        this.month = month;
        this.year = year;
        this.time = time;
        this.status = status;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStd_id() {
        return std_id;
    }

    public String getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

}

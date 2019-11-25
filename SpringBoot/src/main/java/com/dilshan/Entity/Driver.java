package com.dilshan.Entity;

public class Driver {
    private int Id;
    private String Name;
    private String Spoint;
    private String Fpoint;
    private String Time;
    private String Gender;

    public Driver(int id, String name, String spoint, String fpoint, String time, String gender) {
        Id = id;
        Name = name;
        Spoint = spoint;
        Fpoint = fpoint;
        Time = time;
        Gender = gender;
    }

    public Driver() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpoint() {
        return Spoint;
    }

    public void setSpoint(String spoint) {
        Spoint = spoint;
    }

    public String getFpoint() {
        return Fpoint;
    }

    public void setFpoint(String fpoint) {
        Fpoint = fpoint;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

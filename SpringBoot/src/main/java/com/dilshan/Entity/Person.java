package com.dilshan.Entity;



public class Person {
    private int Id;
    private String Name;
    private String Spoint;
    private String Fpoint;
    private String Time;
    private String Gender;

    public Person(int id, String name, String spoint,String Fpoint,String Time,String Gender) {
        this.Id = id;
        this.Name = name;
        this.Spoint = spoint;
        this.Fpoint = Fpoint;
        this.Time = Time;
        this.Gender = Gender;

    }

    public Person() {
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
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
}

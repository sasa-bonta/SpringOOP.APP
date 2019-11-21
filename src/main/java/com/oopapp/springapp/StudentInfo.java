package com.oopapp.springapp;

public class StudentInfo {
    private String firstName;
    private String secondName;
    private float stipend;
    private float medMark;

    public StudentInfo(String firstName, String secondName, float stipend, float medMark) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.stipend = stipend;
        this.medMark = medMark;
    }

    public StudentInfo() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public float getStipend() {
        return stipend;
    }

    public void setStipend(float stipend) {
        this.stipend = stipend;
    }

    public float getMedMark() {
        return medMark;
    }

    public void setMedMark(float medMark) {
        this.medMark = medMark;
    }

    @Override
    public String toString() {
        return "Nume " +firstName+ " " +secondName+ " Stipendia " +stipend+ " Nota Medie " +medMark+ "";
    }
}

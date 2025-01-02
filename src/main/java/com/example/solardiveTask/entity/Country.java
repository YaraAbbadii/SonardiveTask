package com.example.solardiveTask.entity;

public class Country {
    private int id;
    private String isoCode;

    public Country() {
        // Constructor فارغ
    }

    public Country(int id, String isoCode) {
        this.id = id;
        this.isoCode = isoCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
}
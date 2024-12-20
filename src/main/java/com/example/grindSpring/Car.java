package com.example.grindSpring;

import java.time.LocalDate;

public class Car {
    private String mark = null;
    private String model = null;
    private int year_of_release = 0;
    private String id = null;

    Car(String mark, String model, int year_of_release, String id){
        this.model = model;
        this.year_of_release = year_of_release;
        this.mark = mark;
        this.id = id;
    }

    Car(){

    }

    public int getYear_of_release() {
        return year_of_release;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getId() {
        return id;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear_of_release(int year_of_release) {
        this.year_of_release = year_of_release;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setId(String id) {
        this.id = id;
    }
}

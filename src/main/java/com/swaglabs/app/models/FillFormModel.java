package com.swaglabs.app.models;

public class FillFormModel {

    private String name;
    private String lastName;
    private String cod;

    public FillFormModel(String name, String lastName, String cod) {
        this.name = name;
        this.lastName = lastName;
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCod() {
        return cod;
    }
}

package com.swaglabs.app.models;

public class DataLoginModel {

    private String user;
    private String password;
    private String product;

    public DataLoginModel(String user, String password, String product) {
        this.user = user;
        this.password = password;
        this.product = product;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getProduct() {
        return product;
    }
}

package com.swaglabs.app.exections;

public class UnexpectedResult extends AssertionError {

    public static final String LOGIN_FAIL = "Validate network or data";
    public static final String CART_EMPTY = "The Cart don't have any item";
    public static final String FILL_FORM_FAIL = "Error insert user data";
    public static final String OVERVIEW_FAIL = "The WebService Overview is no up";

    public UnexpectedResult(String message) {
        super(message);
    }

    public UnexpectedResult(String message, Throwable cause) {
        super(message, cause);
    }
}
